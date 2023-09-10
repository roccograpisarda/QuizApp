package com.example.quizapp

object Constants {

    fun getQuestions():ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "America","Argentina",
            "Italy","Australia",
            2
            )
        questionList.add(que1)


        val que2 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "America","Argentina",
            "Italy","Australia",
            2
        )
        questionList.add(que2)


        val que3 = Question(
            3,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "America","Argentina",
            "Italy","Australia",
            2
        )
        questionList.add(que3)


        val que4 = Question(
            4,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "America","Argentina",
            "Italy","Australia",
            2
        )
        questionList.add(que4)



        val que5 = Question(
            5,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "America","Argentina",
            "Italy","Australia",
            2
        )
        questionList.add(que5)


        val que6 = Question(
            6,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "America","Argentina",
            "Italy","Australia",
            2
        )
        questionList.add(que6)


        val que7 = Question(
            7,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "America","Argentina",
            "Italy","Australia",
            2
        )
        questionList.add(que7)

        val que8 = Question(
            8,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "America","Argentina",
            "Italy","Australia",
            2
        )
        questionList.add(que8)


        val que9 = Question(
            9,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "America","Argentina",
            "Italy","Australia",
            2
        )
        questionList.add(que9)





        return questionList




    }
}