package com.example.laundrytrackerapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class RegistrationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        val registerButton: Button = findViewById(R.id.registerButton)
        registerButton.setOnClickListener {
            val username = findViewById<EditText>(R.id.usernameInput).text.toString()
            val password = findViewById<EditText>(R.id.passwordInput).text.toString()
        }
    }
}