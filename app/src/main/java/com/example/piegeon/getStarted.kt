package com.example.pigeon

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.EdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.Insets
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class GetStarted : AppCompatActivity() {

    private lateinit var mAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        EdgeToEdge.enable(this)
        setContentView(R.layout.activity_get_started)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars: Insets = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        mAuth = FirebaseAuth.getInstance()
        val currentUser: FirebaseUser? = mAuth.currentUser
        if (currentUser != null) {
            // If user is already logged in, redirect to MainActivity
            startActivity(Intent(this@GetStarted, MainActivity::class.java))
            finish() // Optional: Close the Get Started activity to prevent going back to it
        }

        // Get reference to the TextView
        val loginTextView: TextView = findViewById(R.id.login_text_view)

        // Set OnClickListener for the TextView
        loginTextView.setOnClickListener {
            // Navigate to the login activity
            startActivity(Intent(this@GetStarted, Login::class.java))
        }
    }
}
