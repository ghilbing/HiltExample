package com.hilbing.hiltexample.database

import android.util.Log
import com.hilbing.hiltexample.TAG
import javax.inject.Inject

class DatabaseService @Inject constructor() {

    fun log(message: String){
        Log.d(TAG, "log: DatabaseServiceMessage")
    }
}