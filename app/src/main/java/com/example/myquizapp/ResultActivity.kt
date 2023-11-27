package com.example.myquizapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class ResultActivity : ComponentActivity() {


    private var finishButton: Button? = null
    private var congratulationsText: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        finishButton = findViewById(R.id.finishButton)
        congratulationsText = findViewById(R.id.congratsText)

        finishButton?.setOnClickListener {
            finish()
        }

    }

    override fun onStart() {
        super.onStart()

        congratulationsText?.text = "${intent.getStringExtra(Constants.usernameStringKey)}, congratulations on completing the quiz!"
    }
}