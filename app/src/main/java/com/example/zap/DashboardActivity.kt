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
        val et_name = findViewById<TextView>(R.id.et_name)

        //Set the Greeting Text
        tv_greeting.text = userName

        //Get the Front end Categories by CardView
        val general_category = findViewById<CardView>(R.id.general_category)
        val history_category = findViewById<CardView>(R.id.history_category)
        val movies_category = findViewById<CardView>(R.id.movies_category)
        val comics_category = findViewById<CardView>(R.id.comics_category)

        val mCategoryGen = findViewById<TextView>(R.id.general_category_name)
        val mCategoryHis = findViewById<TextView>(R.id.history_category_name)
        val mCategoryMov = findViewById<TextView>(R.id.movies_category_name)
        val mCategoryCom = findViewById<TextView>(R.id.comics_category_name)

        //General Category OnClickListener
        general_category.setOnClickListener{
            val intent = Intent(this, GeneralQuizActivity::class.java)
            intent.putExtra(Constants.USERNAME, tv_greeting.text.toString())
            intent.putExtra(Constants.CATEGORY, mCategoryGen.text.toString())
            startActivity(intent);
        }

        //History Category OnClickListener
        history_category.setOnClickListener{
            val intent = Intent(this, HistoryQuizActivity::class.java)
            intent.putExtra(Constants.USERNAME, tv_greeting.text.toString())
            intent.putExtra(Constants.CATEGORY, mCategoryHis.text.toString())
            startActivity(intent);
        }

        //Movies Category OnClickListener
        movies_category.setOnClickListener{
            val intent = Intent(this, MoviesQuizActivity::class.java)
            intent.putExtra(Constants.USERNAME, tv_greeting.text.toString())
            intent.putExtra(Constants.CATEGORY, mCategoryMov.text.toString())
            startActivity(intent);
        }

        //Comics Category OnClickListener
        comics_category.setOnClickListener{
            val intent = Intent(this, ComicsQuizActivity::class.java)
            intent.putExtra(Constants.USERNAME, tv_greeting.text.toString())
            intent.putExtra(Constants.CATEGORY, mCategoryCom.text.toString())
            startActivity(intent);
        }

    }
}