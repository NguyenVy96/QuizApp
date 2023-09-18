package com.vynguyen.quizapp

import androidx.appcompat.app.AppCompatActivity

open class CommonActivity : AppCompatActivity() {

    open fun onCreate() {
        Utils.setStatusBarColor(this, R.color.violet_status_bar)
    }
}