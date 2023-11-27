package com.example.myquizapp

object Constants {


    const val usernameStringKey = "username"
    fun getQuestions(): ArrayList<Question>{

        val questionArrayList: ArrayList<Question> = ArrayList();
        val questionOne = Question(1, R.drawable.ic_flag_of_argentina, "Which country is this flag associated with?", "China", "Argentina", "Belize", "Canada", 2)
        val questionTwo = Question(2, R.drawable.ic_flag_of_australia, "Which country is this flag associated with?", "Australia", "Austria", "Mexico", "New Zealand", 1)
        val questionThree = Question(3, R.drawable.ic_flag_of_belgium, "Which country is this flag associated with?", "Belarus", "Belgium", "Algeria", "Morocco", 2)
        val questionFour = Question(4, R.drawable.ic_flag_of_brazil, "Which country is this flag associated with?", "Benin", "Brazil", "Croatia", "Egypt", 2)
        val questionFive = Question(5, R.drawable.ic_flag_of_denmark, "Which country is this flag associated with?", "South Africa", "Denmark", "USA", "Libya", 2)
        val questionSix = Question(6, R.drawable.ic_flag_of_fiji, "Which country is this flag associated with?", "Thailand", "Laos", "Fiji", "Togo", 3)
        val questionSeven = Question(7, R.drawable.ic_flag_of_germany, "Which country is this flag associated with?", "France", "Austria", "Chile", "Germany", 4)
        val questionEight = Question(8, R.drawable.ic_flag_of_india, "Which country is this flag associated with?", "India", "Panama", "Colombia", "Egypt", 1)
        val questionNine = Question(9, R.drawable.ic_flag_of_kuwait, "Which country is this flag associated with?", "Qatar", "Iraq", "Croatia", "Kuwait", 4)
        val questionTen = Question(10, R.drawable.ic_flag_of_new_zealand, "Which country is this flag associated with?", "Benin", "New Zealand", "Croatia", "Egypt", 2)




        questionArrayList.add(questionOne)
        questionArrayList.add(questionTwo)
        questionArrayList.add(questionThree)
        questionArrayList.add(questionFour)
        questionArrayList.add(questionFive)
        questionArrayList.add(questionSix)
        questionArrayList.add(questionSeven)
        questionArrayList.add(questionEight)
        questionArrayList.add(questionNine)
        questionArrayList.add(questionTen)

        return questionArrayList
    }
}