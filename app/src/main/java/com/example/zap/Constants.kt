package com.example.zap

object Constants {

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

        val genQuestion2 = Question(2, "This superhero's super tools included bullet-proof bracelets and a\n" +
                "magic lasso. Who is she?", "General",
            R.drawable.general_category_image,
            "Catwoman",
            "Super Girl",
            "Wonder Woman",
            3)
        generalQuestionsList.add(genQuestion2)

        val genQuestion3 = Question(3, "Which superhero cannot transform back into the human form\n" +
                "anymore?", "General",
            R.drawable.general_category_image,
            "Jacob",
            "The Thing",
            "The Incredible Hulk",
            2)
        generalQuestionsList.add(genQuestion3)

        val genQuestion4 = Question(4, "What villain got his distinctive appearance from toxic chemicals at\n" +
                "a plant?", "General",
            R.drawable.general_category_image,
            "The Joker",
            "Two-Face",
            "Doomsday",
            1)
        generalQuestionsList.add(genQuestion4)

        return generalQuestionsList
    }
}