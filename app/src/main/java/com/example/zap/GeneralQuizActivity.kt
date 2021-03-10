package com.example.zap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class GeneralQuizActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_general_quiz)

        //Make the View FullScreen
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        //Get the General Questions List
        val generalQuestionsList = Constants.generalQuestions()

        val currentPosition = 1
        val generalQuestion: Question? = generalQuestionsList[currentPosition - 1]

        //Get General Question Items
        var general_progressbar = findViewById<ProgressBar>(R.id.general_progressbar)
        var tv_general_progress = findViewById<TextView>(R.id.tv_general_progress)
        var tv_general_question = findViewById<TextView>(R.id.tv_general_question)
        var general_category_bottom_image = findViewById<ImageView>(R.id.general_category_bottom_image)

        //Get General Question Options
        var tv_general_option_one = findViewById<TextView>(R.id.tv_general_option_one)
        var tv_general_option_two = findViewById<TextView>(R.id.tv_general_option_two)
        var tv_general_option_three = findViewById<TextView>(R.id.tv_general_option_three)

        general_progressbar.progress = currentPosition
        tv_general_progress.text = "$currentPosition" + "/" + general_progressbar.max
        tv_general_question.text = generalQuestion!!.question
        general_category_bottom_image.setImageResource(generalQuestion.categoryImage)

        //Add General Questions Options
        tv_general_option_one.text = generalQuestion.optionOne
        tv_general_option_two.text = generalQuestion.optionTwo
        tv_general_option_three.text = generalQuestion.optionThree
    }
}