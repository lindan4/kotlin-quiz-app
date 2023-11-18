package com.example.myquizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton: Button = findViewById(R.id.startBtn)

        startButton.setOnClickListener {
            val nameInput: EditText = findViewById(R.id.nameInput);

            if (nameInput.text.isNotEmpty()) {
                val quizStartIntent = Intent(this, QuizActivity::class.java)

                startActivity(quizStartIntent)
            }
            else {
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_LONG).show()
            }

        }
    }
}
