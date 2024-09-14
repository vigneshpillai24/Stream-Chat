package com.mbadevelopers.chatapp.mvvm.splash

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.mbadevelopers.chatapp.R
import com.mbadevelopers.chatapp.databinding.ActivitySplashBinding
import com.mbadevelopers.chatapp.helpers.AppNavigation.navigateToChannelList
import com.mbadevelopers.chatapp.helpers.BaseActivity
import com.mbadevelopers.chatapp.helpers.Extensions.handler
import com.mbadevelopers.chatapp.helpers.Extensions.setViewAnimation

@SuppressLint("CustomSplashScreen")
class SplashActivity : BaseActivity() {
    private lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash)
        initializeFields()
    }

    private fun initializeFields() {
        binding.ivLogo.setViewAnimation(R.anim.splash_fade_in)
        handler(3000) {
            navigateToChannelList { finish() }
        }
    }

}