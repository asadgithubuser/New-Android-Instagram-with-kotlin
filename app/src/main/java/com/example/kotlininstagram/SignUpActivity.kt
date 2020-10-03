package com.example.kotlininstagram

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        (findViewById<Button>(R.id.go_login_page_btn)).setOnClickListener{
            val intent:Intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
    }
}
