package com.hbf.videoplayer

import android.media.MediaPlayer
import android.support.v17.leanback.media.MediaPlayerAdapter

class Test {

    fun setSpeed(adapter: MediaPlayerAdapter, speed: Int) {
        try {
            val field = adapter.javaClass.getDeclaredField("mPlayer")
            field.isAccessible = true
            val player = field.get(adapter) as MediaPlayer
            val setParameter = player.javaClass.getDeclaredMethod("setParameter", Int::class.javaPrimitiveType, Int::class.javaPrimitiveType)
            setParameter.invoke(player, 1300, speed)
        } catch (e: Throwable) {
            e.printStackTrace()
        }

    }

}
