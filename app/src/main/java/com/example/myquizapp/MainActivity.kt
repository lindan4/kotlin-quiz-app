package com.example.myquizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {

    private var nameInput: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameInput = findViewById(R.id.nameInput);

        val startButton: Button = findViewById(R.id.startBtn)

        startButton.setOnClickListener {

            nameInput?.let {
                if (it.text.isNotEmpty()) {
                    val quizStartIntent = Intent(this, QuizActivity::class.java)
                    quizStartIntent.putExtra(Constants.usernameStringKey, it.text.toString())

                    startActivity(quizStartIntent)
                }
                else {
                    Toast.makeText(this, "Please enter your name", Toast.LENGTH_LONG).show()
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        nameInput?.let {
            it.setText("")
        }
    }
}
