package com.hilbing.hiltexample.database

import android.util.Log
import com.hilbing.hiltexample.TAG
import javax.inject.Inject

class DatabaseAdapter @Inject constructor(var databaseService: DatabaseService) {
    fun log(message: String){
        Log.d(TAG, "log: DatabaseAdapter: $message")
        databaseService.log(message)
    }
}