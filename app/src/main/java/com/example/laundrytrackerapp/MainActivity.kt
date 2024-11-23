package com.example.laundrytrackerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.laundrytrackerapp.ui.theme.LaundryTrackerAppTheme
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.landing_page)

        val getStartedButton: Button = findViewById(R.id.btnGetStarted)
        getStartedButton.setOnClickListener {
            // Navigate to RegistrationActivity
            val intent = Intent(this, RegistrationActivity::class.java)
            startActivity(intent)
        }
    }
}

@Composable
fun LandingPage(modifier: Modifier = Modifier) {


}

@Preview(showBackground = true)
@Composable
fun LandingPagePreview() {
    LaundryTrackerAppTheme {
        LandingPage()
    }
}