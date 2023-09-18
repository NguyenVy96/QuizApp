package com.vynguyen.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LogInActivity : CommonActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        super.onCreate()
        setContentView(R.layout.login_activity)
        Utils.setStatusBarColor(this, R.color.blue_status_bar)

        val btnStart: Button = findViewById(R.id.btn_start)
        val edtName: EditText = findViewById(R.id.edt_name)

        btnStart.setOnClickListener {
            val name = edtName.text.toString().trim()
            if (name.isEmpty()) {
                Toast.makeText(this, R.string.insert_name, Toast.LENGTH_SHORT).show()
            } else {
                // need save user name and start new activity
                val intent = Intent(IntentConstant.ACTION_QUESTION)
                startActivity(intent)
                finish()
            }
        }
    }

    override fun onCreate() {
        Utils.setStatusBarColor(this, R.color.blue_status_bar)
    }
}