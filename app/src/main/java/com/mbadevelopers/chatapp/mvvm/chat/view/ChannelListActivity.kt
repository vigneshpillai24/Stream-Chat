package com.mbadevelopers.chatapp.mvvm.chat.view

import android.content.Context
import android.os.Bundle
import androidx.activity.viewModels
import androidx.core.view.isVisible
import androidx.databinding.DataBindingUtil
import com.mbadevelopers.chatapp.R
import com.mbadevelopers.chatapp.databinding.ActivityChatListBinding
import com.mbadevelopers.chatapp.helpers.BaseActivity
import com.mbadevelopers.chatapp.helpers.Constants
import com.mbadevelopers.chatapp.helpers.Extensions.printLog
import io.getstream.chat.android.client.ChatClient
import io.getstream.chat.android.client.logger.ChatLogLevel
import io.getstream.chat.android.models.Filters
import io.getstream.chat.android.models.GuestUser
import io.getstream.chat.android.models.User
import io.getstream.chat.android.offline.plugin.factory.StreamOfflinePluginFactory
import io.getstream.chat.android.state.plugin.config.StatePluginConfig
import io.getstream.chat.android.state.plugin.factory.StreamStatePluginFactory
import io.getstream.chat.android.state.plugin.state.querychannels.ChannelsStateData
import io.getstream.chat.android.ui.viewmodel.channels.ChannelListViewModel
import io.getstream.chat.android.ui.viewmodel.channels.ChannelListViewModelFactory
import io.getstream.chat.android.ui.viewmodel.channels.bindView

class ChannelListActivity : BaseActivity() {
    lateinit var binding: ActivityChatListBinding
    private lateinit var client: ChatClient

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_chat_list)
       init()
    }

    private fun init() {
        binding.layoutProgress.root.isVisible = true
        if (!::client.isInitialized) {
            val offlinePluginFactory = StreamOfflinePluginFactory(appContext = this)
            val statePluginFactory = StreamStatePluginFactory(
                config = StatePluginConfig(
                    backgroundSyncEnabled = true,
                    userPresence = true
                ),
                appContext = this
            )

            client = ChatClient.Builder(Constants.STREAM_API_KEY, applicationContext)
                .withPlugins(offlinePluginFactory, statePluginFactory)
                .logLevel(ChatLogLevel.ALL) // Set to NOTHING in prod
                .build()
        }

        getBobUserToken()

        val (savedUserId, savedToken) = getSavedGuestUserData()
        if (savedUserId != null && savedToken != null) {
            // Use saved token to connect the user
            client.connectUser(User(id = savedUserId), savedToken).enqueue { result ->
                if (result.isSuccess) {
                    // User successfully connected
                    "User connected with saved token".printLog()
                    // Proceed with setting up UI, etc.
                    setupChannelUI()
                } else {
                    // Handle connection failure
                    "Failed to connect user with saved token: ${result.errorOrNull()?.message}".printLog()
                }
            }
        } else {
            // If no saved user data, create a new guest user
            val user = User(id = "Alice", name = "Alice", image = "https://bit.ly/2TIt8NR")
            getGuestUserToken(user.id, user.name)
        }
    }


    fun getGuestUserToken(userId: String, userName: String) {
        // Get the ChatClient instance

        val offlinePluginFactory = StreamOfflinePluginFactory(appContext = this)
        val statePluginFactory = StreamStatePluginFactory(
            config = StatePluginConfig(
                backgroundSyncEnabled = true,
                userPresence = true,
            ),
            appContext = this,
        )

        val client = ChatClient.Builder(Constants.STREAM_API_KEY, applicationContext)
            .withPlugins(offlinePluginFactory, statePluginFactory)
            .logLevel(ChatLogLevel.ALL) // Set to NOTHING in prod
            .build()

        // Request a guest token for the user
        client.getGuestToken(userId = userId, userName = userName).enqueue { result ->
            if (result.isSuccess) {
                val guestUser: GuestUser? = result.getOrNull()
                val token = guestUser?.token
                val user: User? = guestUser?.user

                // Log the user and token information
                "Guest User: ${user?.id}, Token: $token".printLog()

                if (user != null && token != null) {
                    saveGuestUserData(user.id, token)
                    connectGuestUser(user, token, client)
                } else {
                   "Guest user or token is null".printLog()
                }
            } else {
                // Handle the failure case
                "Failed to get guest token: ${result.errorOrNull()?.message}".printLog()
            }
        }
    }

    fun connectGuestUser(user: User?, token: String?, client: ChatClient) {
        if (user != null && token != null) {
            client.connectUser(user, token).enqueue { result ->
                if (result.isSuccess) {
                    setupChannelUI()
            } else {
                "here is something went wrong".printLog()
            }
            }
        }
    }

    private fun setupChannelUI() {
        val viewModelFactory = ChannelListViewModelFactory(
            filter = Filters.and(Filters.eq("type", "messaging"),
            ),
            sort = ChannelListViewModel.DEFAULT_SORT
        )
        val viewModel: ChannelListViewModel by viewModels { viewModelFactory }

        // Bind the channel list view to the view model
        viewModel.bindView(binding.channelListView, this)

        binding.layoutProgress.root.isVisible = false

        // Observe the ViewModel state
        viewModel.state.observe(this) { state ->

            binding.layoutProgress.root.isVisible = false == !state.isLoading
        }

        // Set click listener to open chat details
        binding.channelListView.setChannelItemClickListener { selectedChannel ->
            startActivity(ChatDetailActivity.newIntent(this, selectedChannel))
        }
    }

    private fun getBobUserToken(){
        client.getGuestToken(userId = "Bob_bb8a3eb6-7c41-403f-ba3b-4866721c6284", userName = "Bob").enqueue { result ->
            if (result.isSuccess) {
                val guestUser: GuestUser? = result.getOrNull()
                val token = guestUser?.token
                val user: User? = guestUser?.user

                "Bob Guest User: ${user?.id}, Token: $token".printLog()
            } else {
                "Failed to get guest token: ${result.errorOrNull()?.message}".printLog()
            }
        }
    }

    private fun saveGuestUserData(userId: String, token: String) {
        val sharedPreferences = getSharedPreferences("guest_user_prefs", Context.MODE_PRIVATE)
        with(sharedPreferences.edit()) {
            putString("user_id", userId)
            putString("token", token)
            apply()
        }
    }


    private fun getSavedGuestUserData(): Pair<String?, String?> {
        val sharedPreferences = getSharedPreferences("guest_user_prefs", Context.MODE_PRIVATE)
        val userId = sharedPreferences.getString("user_id", null)
        val token = sharedPreferences.getString("token", null)
        return Pair(Constants.ALICE_USER_ID, Constants.Alice_USER_TOKEN)  // Hardcoded default Alice user id & Alice Token
    }
}