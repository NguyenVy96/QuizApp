package com.vynguyen.quizapp

import android.app.Application
import android.content.Intent

class QuizApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        val intent = Intent(IntentConstant.ACTION_LOGIN)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(intent)
    }

}