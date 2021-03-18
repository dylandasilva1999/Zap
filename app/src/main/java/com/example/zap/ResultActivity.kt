package com.example.zap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        //Make the View FullScreen
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val greet_name = findViewById<TextView>(R.id.greet_name)
        val tv_score = findViewById<TextView>(R.id.tv_score)
        val btn_finish = findViewById<Button>(R.id.btn_finish)

        val userName = intent.getStringExtra(Constants.USERNAME)
        greet_name.text = userName

        val totalQuestions = intent.getIntExtra(Constants.QUESTIONS_TOTAL, 0)
        val correctOptions = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        tv_score.text = "You scored a total of $correctOptions out of $totalQuestions"

        btn_finish.setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
        }

    }
}