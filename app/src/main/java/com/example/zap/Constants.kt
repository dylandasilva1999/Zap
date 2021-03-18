package com.example.zap

import java.util.*
import kotlin.collections.ArrayList

object Constants {

    const val USERNAME: String = "user_name"
    const val QUESTIONS_TOTAL: String = "questions_total"
    const val CORRECT_ANSWERS: String = "correct_answers"

    //General Questions
    fun generalQuestions(): ArrayList<Question> {
        val generalQuestionsList = ArrayList<Question>()

        val genQuestion1 = Question(1, "What is Captain America’s shield made of?", "General",
        R.drawable.general_category_image,
            "Proto-adamantium",
            "Titanium",
            "Cheese",
            1)
        generalQuestionsList.add(genQuestion1)

        val genQuestion2 = Question(2, "This superhero's super tools included bullet-proof bracelets and a magic lasso. Who is she?", "General",
            R.drawable.general_category_image,
            "Catwoman",
            "Super Girl",
            "Wonder Woman",
            3)
        generalQuestionsList.add(genQuestion2)

        val genQuestion3 = Question(3, "Which superhero cannot transform back into the human form anymore?", "General",
            R.drawable.general_category_image,
            "Jacob",
            "The Thing",
            "The Incredible Hulk",
            2)
        generalQuestionsList.add(genQuestion3)

        val genQuestion4 = Question(4, "What villain got his distinctive appearance from toxic chemicals at a plant?", "General",
            R.drawable.general_category_image,
            "The Joker",
            "Two-Face",
            "Doomsday",
            1)
        generalQuestionsList.add(genQuestion4)

        val genQuestion5 = Question(5, "Who is the archenemy of Aquaman?", "General",
                R.drawable.general_category_image,
                "Lex Luthor",
                "Black Manta",
                "Shark",
                2)
        generalQuestionsList.add(genQuestion5)

        val genQuestion6 = Question(6, "How did Spiderman have his superpowers?", "General",
                R.drawable.general_category_image,
                "Born with it",
                "Cosmic Rays",
                "Radioactive Spider",
                3)
        generalQuestionsList.add(genQuestion6)

        val genQuestion7 = Question(7, "The Green Lantern gains his power from which object?", "General",
                R.drawable.general_category_image,
                "A ring",
                "A necklace",
                "Glasses",
                1)
        generalQuestionsList.add(genQuestion7)

        val genQuestion8 = Question(8, "What villain got his distinctive appearance from toxic chemicals at a plant?", "General",
                R.drawable.general_category_image,
                "The Joker",
                "Two-Face",
                "Doomsday",
                1)
        generalQuestionsList.add(genQuestion8)

        Collections.shuffle(generalQuestionsList)
        return generalQuestionsList
    }

    //History Questions
    fun historyQuestions(): ArrayList<Question> {
        val historyQuestionsList = ArrayList<Question>()

        val hisQuestion1 = Question(1, "What was the first colour the Hulk would have been?", "History",
                R.drawable.history_category_image,
                "Black",
                "Grey",
                "Red",
                2)
        historyQuestionsList.add(hisQuestion1)

        val hisQuestion2 = Question(2, "Which superhero was supposed to be bald in his debut?", "History",
                R.drawable.history_category_image,
                "Professor X",
                "Apocalypse",
                "Superman",
                3)
        historyQuestionsList.add(hisQuestion2)

        val hisQuestion3 = Question(3, "Who was the first superhero created in the history of superheroes?", "History",
                R.drawable.history_category_image,
                "The Phantom",
                "The Comet",
                "Superman",
                1)
        historyQuestionsList.add(hisQuestion3)

        val hisQuestion4 = Question(4, "What is the original age of the Black Widow?", "History",
                R.drawable.history_category_image,
                "48 Years",
                "54 Years",
                "70 Years",
                3)
        historyQuestionsList.add(hisQuestion4)

        val hisQuestion5 = Question(5, "6 Who made Captain America’s shield?", "History",
                R.drawable.history_category_image,
                "United States Army",
                "Howard Stark",
                "Roosevelt",
                2)
        historyQuestionsList.add(hisQuestion5)

        val hisQuestion6 = Question(6, "What was the originally proposed shape of Captain America’s shield?", "History",
                R.drawable.history_category_image,
                "Pavise-shaped",
                "Kite-shaped",
                "Herladic-shaped",
                3)
        historyQuestionsList.add(hisQuestion6)

        val hisQuestion7 = Question(7, "Who is this superhero who first appeared in the Marvel universe in 1962?", "History",
                R.drawable.history_category_image,
                "The Hulk",
                "The Abomination",
                "Mr.Sinister",
                1)
        historyQuestionsList.add(hisQuestion7)

        val hisQuestion8 = Question(8, "In which back-to-back years did Superman and Batman debut?", "History",
                R.drawable.history_category_image,
                "1942 and 1943",
                "1938 and 1939",
                "1953 and 1954",
                2)
        historyQuestionsList.add(hisQuestion8)

        Collections.shuffle(historyQuestionsList)
        return historyQuestionsList
    }

}