package com.example.logutil

import android.util.Log
import com.example.lib.Degrees

class DebugLog {
    companion object {
        const val TAG = "AppDebug"
    }
    fun d(message: String){
        Degrees()
        Log.d(TAG, message)
    }
}