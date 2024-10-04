package com.example.pigeon

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.Insets
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.pigeon.R

class Splash : AppCompatActivity() {

    companion object {
        private const val SPLASH_DURATION = 4000 // Splash screen duration in milliseconds
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // You may remove or replace EdgeToEdge if causing issues
        // EdgeToEdge.enable(this)
        setContentView(R.layout.activity_splash)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars: Insets = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Handler().postDelayed({
            val intent = Intent(this@Splash, GetStarted::class.java)
            startActivity(intent)
            finish() // Finish splash activity so it's not displayed when back button is pressed
        }, SPLASH_DURATION.toLong())
    }
}
