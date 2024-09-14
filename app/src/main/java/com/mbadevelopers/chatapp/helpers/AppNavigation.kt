package com.mbadevelopers.chatapp.helpers

import android.content.Context
import android.content.Intent
import com.mbadevelopers.chatapp.mvvm.chat.view.ChannelListActivity

/**
 * Created by Balavignesh on 14-09-2024.
 */
object AppNavigation {

    fun Context.navigateToChannelList(msg: String = "", block: () -> Unit) {
        val intent = Intent(this, ChannelListActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
        block()
    }
}