package com.example.zap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        //Make the View FullScreen
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        //Get TextView in Frontend
        val tv_greeting = findViewById<TextView>(R.id.greet_name)

        //Get the Intent with the name from Activity Main
        val userName = intent.getStringExtra(EXTRA_MESSAGE)

        //Set the Greeting Text
        tv_greeting.text = userName

        //Get the Front end Categories by CardView
        val general_category = findViewById<CardView>(R.id.general_category)
        val history_category = findViewById<CardView>(R.id.history_category)
        val movies_category = findViewById<CardView>(R.id.movies_category)
        val comics_category = findViewById<CardView>(R.id.comics_category)

        //General Category OnClickListener
        general_category.setOnClickListener{
            val intent = Intent(this, GeneralQuizActivity::class.java)
            startActivity(intent);
        }

        //History Category OnClickListener
        history_category.setOnClickListener{
            val intent = Intent(this, HistoryQuizActivity::class.java)
            startActivity(intent);
        }

        //Movies Category OnClickListener
        movies_category.setOnClickListener{
            val intent = Intent(this, MoviesQuizActivity::class.java)
            startActivity(intent);
        }

        //Comics Category OnClickListener
        comics_category.setOnClickListener{
            val intent = Intent(this, ComicsQuizActivity::class.java)
            startActivity(intent);
        }

    }
}