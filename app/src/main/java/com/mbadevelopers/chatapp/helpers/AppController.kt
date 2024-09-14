package com.mbadevelopers.chatapp.helpers


import android.app.Application

/**
 * Created by Bala Vignessh on 14-09-2024.
 */

class AppController : Application(){

    companion object {
        lateinit var instance: AppController
            private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}