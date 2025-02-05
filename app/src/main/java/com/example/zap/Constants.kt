package com.example.zap

import java.util.*
import kotlin.collections.ArrayList

object Constants {

    const val USERNAME: String = "user_name"
    const val QUESTIONS_TOTAL: String = "questions_total"
    const val CORRECT_ANSWERS: String = "correct_answers"
    const val CATEGORY: String = "category_name"
    const val GENERAL_HIGHEST_SCORE: String = "general_highest_score"
    const val HISTORY_HIGHEST_SCORE: String = "history_highest_score"
    const val MOVIES_HIGHEST_SCORE: String = "movies_highest_score"
    const val COMICS_HIGHEST_SCORE: String = "comics_highest_score"

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

        val genQuestion8 = Question(8, "What is the name of the microscopic universe Ant-Man travels to when he goes sub-atomic?", "General",
                R.drawable.general_category_image,
                "Quantum Realm",
                "Quantum Penillium",
                "Micro Realm",
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

        val hisQuestion5 = Question(5, "Who made Captain America’s shield?", "History",
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

    //Movies Questions
    fun moviesQuestions(): ArrayList<Question> {
        val moviesQuestionsList = ArrayList<Question>()

        val movQuestion1 = Question(1, "Iron Man Tony Stark's loyal assistant goes by what name?", "Movies",
            R.drawable.movies_category_image,
            "Jarvis",
            "Pepper Lots",
            "Pepper Pots",
            3)
        moviesQuestionsList.add(movQuestion1)

        val movQuestion2 = Question(2, "What relation are Sue and Johnny in Fantastic Four?", "Movies",
            R.drawable.movies_category_image,
            "Brother and Sister",
            "Aunt and Uncle",
            "Cousin and Nephew",
            1)
        moviesQuestionsList.add(movQuestion2)

        val movQuestion3 = Question(3, "In which 2000 movie did James Marsden play the character Cyclops?", "Movies",
            R.drawable.movies_category_image,
            "Superman",
            "Avengers",
            "X-Men",
            3)
        moviesQuestionsList.add(movQuestion3)

        val movQuestion4 = Question(4, "Who plays Mary Jane in the movie Spider-Man 3?", "Movies",
            R.drawable.movies_category_image,
            "Shailene Woodley",
            "Kirsten Dunst",
            "Tara Strong",
            2)
        moviesQuestionsList.add(movQuestion4)

        val movQuestion5 = Question(5, "What villain returns from Latveria in 2007's 4: Rise of the Silver Surfer?", "Movies",
            R.drawable.movies_category_image,
            "Galactus",
            "Victor Von Doom",
            "Annihilus",
            2)
        moviesQuestionsList.add(movQuestion5)

        val movQuestion6 = Question(6, "What is the name of the lake where the final scenes of X-Men 2 take place?", "Movies",
            R.drawable.movies_category_image,
            "Alkali Lake",
            "Lake Simcoe",
            "Lake Athabasca",
            1)
        moviesQuestionsList.add(movQuestion6)

        val movQuestion7 = Question(7, "Who was sucked into the portal at the beginning of Hellboy?", "Movies",
            R.drawable.movies_category_image,
            "Grigori Rasputin",
            "Ogdru Jahad",
            "Hellboy",
            1)
        moviesQuestionsList.add(movQuestion7)

        val movQuestion8 = Question(8, "In which back-to-back years did Superman and Batman debut?", "Movies",
            R.drawable.movies_category_image,
            "Batman Begins",
            "Batman Forever",
            "Batman and Robin",
            3)
        moviesQuestionsList.add(movQuestion8)

        Collections.shuffle(moviesQuestionsList)
        return moviesQuestionsList
    }

    //Comics Questions
    fun comicsQuestions(): ArrayList<Question> {
        val comicsQuestionsList = ArrayList<Question>()

        val comQuestion1 = Question(1, "What superhero grew up on the planet Tamaran?", "Comics",
            R.drawable.comic_category_image,
            "The Silver Surfer",
            "Ultra Boy",
            "Star Fire",
            3)
        comicsQuestionsList.add(comQuestion1)

        val comQuestion2 = Question(2, "Edwin Jarvis serves as butler to what superteam?", "Comics",
            R.drawable.comic_category_image,
            "Justice League",
            "Avengers",
            "Teen Titans",
            2)
        comicsQuestionsList.add(comQuestion2)

        val comQuestion3 = Question(3, "What year was the first modern comic book printed?", "Comics",
            R.drawable.comic_category_image,
            "1938",
            "1917",
            "1933",
            3)
        comicsQuestionsList.add(comQuestion3)

        val movQuestion4 = Question(4, "What superhero gained his powers after being exposed to the Orb of Ra?", "Comics",
            R.drawable.comic_category_image,
            "Metamorhpo",
            "Doctor Strange",
            "Hawkman",
            1)
        comicsQuestionsList.add(movQuestion4)

        val comQuestion5 = Question(5, "Which of the following heroes was NOT a member of the magically powered Sentinels of Magic?", "Comics",
            R.drawable.comic_category_image,
            "Doctor Strange",
            "Raven",
            "Zatanna",
            1)
        comicsQuestionsList.add(comQuestion5)

        val comQuestion6 = Question(6, "What is the best-selling comic book of all time?", "Comics",
            R.drawable.comic_category_image,
            "Batman",
            "X-Men",
            "Superman",
            2)
        comicsQuestionsList.add(comQuestion6)

        val comQuestion7 = Question(7, "What was the first comic book to feature a recurring character?", "Comics",
            R.drawable.comic_category_image,
            "Max and Moritz",
            "Historie De M. Vieux Bois",
            "Ally Sloper's Half Holiday",
            3)
        comicsQuestionsList.add(comQuestion7)

        val comQuestion8 = Question(8, "What was first introduced in Detective Comics #29?", "Comics",
            R.drawable.comic_category_image,
            "The Batmobile",
            "Robin",
            "Batman’s Utility Belt",
            3)
        comicsQuestionsList.add(comQuestion8)

        Collections.shuffle(comicsQuestionsList)
        return comicsQuestionsList
    }

}