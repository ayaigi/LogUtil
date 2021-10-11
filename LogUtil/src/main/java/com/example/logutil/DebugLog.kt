package com.example.logutil

import android.util.Log

class DebugLog {
    companion object {
        const val TAG = "AppDebug"
    }
    fun d(message: String){
        Log.d(TAG, message)
    }
}