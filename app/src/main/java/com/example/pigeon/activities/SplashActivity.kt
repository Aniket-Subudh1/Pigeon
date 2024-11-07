package com.example.pigeon.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.pigeon.R


class SplashActivity : AppCompatActivity() {
    private val splashScreenDuration = 4000L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash)

        // Apply window insets for edge-to-edge experience
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Use a Handler to delay the transition to SignInActivity
        Handler(Looper.getMainLooper()).postDelayed({
            // Start SignInActivity after the splash screen duration
            val intent = Intent(this@SplashActivity, SignInActivity::class.java) // Corrected the intent
            startActivity(intent)
            finish() // Close the SplashActivity so it doesn't remain in the back stack
        }, splashScreenDuration)
    }
}

