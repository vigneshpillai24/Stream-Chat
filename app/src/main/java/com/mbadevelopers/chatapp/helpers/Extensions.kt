package com.mbadevelopers.chatapp.helpers

import android.os.Handler
import android.os.Looper
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils

/**
 * Created by Balavignesh on 14-09-2024.
 */
object Extensions {
    fun String.printLog(tag: String = "") {
      println("$tag ::: $this ")
    }

    fun View.setViewAnimation(animationInt: Int) {
        val animation: Animation = AnimationUtils.loadAnimation(this.context, animationInt)
        startAnimation(animation)
    }

    fun handler(delay: Long, block: () -> Unit) {
        Handler(Looper.getMainLooper()).postDelayed({
            block()
        }, delay)
    }


}