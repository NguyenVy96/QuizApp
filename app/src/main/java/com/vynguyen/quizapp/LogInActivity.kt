package com.vynguyen.quizapp

import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowInsets
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

@Suppress("DEPRECATION")
class LogInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)
//        hideStatusBar()
        setStatusBarColor()

        val btnStart: Button = findViewById(R.id.btn_start)
        val edtName: EditText = findViewById(R.id.edt_name)

        btnStart.setOnClickListener {
            val name = edtName.text.toString().trim()
            if (name.isEmpty()) {
                Toast.makeText(this, R.string.insert_name, Toast.LENGTH_SHORT).show()
            } else {
                // need save user name and start new activity

                finish()
            }
        }
    }

    private fun hideStatusBar() {
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        // another solution - bug: soft keyboard cannot adjust resize
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        } else {
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }
    }

    private fun setStatusBarColor() {
        val window: Window = this.window

        // clear FLAG_TRANSLUCENT_STATUS flag:
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)

        // add FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS flag to the window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)

        // finally change the color
        window.statusBarColor = ContextCompat.getColor(this, R.color.blue_status_bar)
    }
}