package com.example.zap

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat

class GeneralQuizActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition: Int = 1
    private var mGeneralQuestionsList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_general_quiz)

        //Make the View FullScreen
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        //Get the General Questions List
        mGeneralQuestionsList = Constants.generalQuestions()

        setGeneralQuestion()

        //Get General Question Options
        var tv_general_option_one = findViewById<TextView>(R.id.tv_general_option_one)
        var tv_general_option_two = findViewById<TextView>(R.id.tv_general_option_two)
        var tv_general_option_three = findViewById<TextView>(R.id.tv_general_option_three)

        tv_general_option_one.setOnClickListener(this)
        tv_general_option_two.setOnClickListener(this)
        tv_general_option_three.setOnClickListener(this)

    }

    private fun setGeneralQuestion() {

        mCurrentPosition = 1
        val generalQuestion = mGeneralQuestionsList!![mCurrentPosition-1]

        defaultOptionsView()

        //Get General Question Items
        var general_progressbar = findViewById<ProgressBar>(R.id.general_progressbar)
        var tv_general_progress = findViewById<TextView>(R.id.tv_general_progress)
        var tv_general_question = findViewById<TextView>(R.id.tv_general_question)
        var general_category_bottom_image = findViewById<ImageView>(R.id.general_category_bottom_image)

        //Get General Question Options
        var tv_general_option_one = findViewById<TextView>(R.id.tv_general_option_one)
        var tv_general_option_two = findViewById<TextView>(R.id.tv_general_option_two)
        var tv_general_option_three = findViewById<TextView>(R.id.tv_general_option_three)

        general_progressbar.progress = mCurrentPosition
        tv_general_progress.text = "$mCurrentPosition" + "/" + general_progressbar.max
        tv_general_question.text = generalQuestion!!.question
        general_category_bottom_image.setImageResource(generalQuestion.categoryImage)

        //Add General Questions Options
        tv_general_option_one.text = generalQuestion.optionOne
        tv_general_option_two.text = generalQuestion.optionTwo
        tv_general_option_three.text = generalQuestion.optionThree

    }

    private fun defaultOptionsView() {

        var tv_general_option_one = findViewById<TextView>(R.id.tv_general_option_one)
        var tv_general_option_two = findViewById<TextView>(R.id.tv_general_option_two)
        var tv_general_option_three = findViewById<TextView>(R.id.tv_general_option_three)

        val options = ArrayList<TextView>()
        options.add(0, tv_general_option_one)
        options.add(1, tv_general_option_two)
        options.add(2, tv_general_option_three)

        for (option in options) {
            option.setTextColor(Color.parseColor("#131313"))
            option.background = ContextCompat.getDrawable(
                    this,
                    R.drawable.option_style
            )
        }

    }

    override fun onClick(v: View?) {

        var tv_general_option_one = findViewById<TextView>(R.id.tv_general_option_one)
        var tv_general_option_two = findViewById<TextView>(R.id.tv_general_option_two)
        var tv_general_option_three = findViewById<TextView>(R.id.tv_general_option_three)

        when(v?.id) {
            R.id.tv_general_option_one ->{
                selectedOptionsView(tv_general_option_one, 1)
            }
            R.id.tv_general_option_two ->{
                selectedOptionsView(tv_general_option_two, 2)
            }
            R.id.tv_general_option_three ->{
                selectedOptionsView(tv_general_option_three, 3)
            }
        }
    }

    private fun selectedOptionsView(tv: TextView, selectedOptionNum: Int) {
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNum

        tv.setTextColor(Color.parseColor("#FFFFFF"))
        tv.background = ContextCompat.getDrawable(
                this,
                R.drawable.general_selected_option_style
        )
    }

}