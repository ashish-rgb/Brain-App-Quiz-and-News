package com.Ashish.quizapp

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val  CORRECT_ANSWERS : String = "correct_answer"

    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val ques1 = Question(
            1,"Which amongst the following mammals has the highest metabolic rate in terms of oxygen consumption (mm3/g hour)?",
            R.drawable.mammals,
            "Dog","Mouse","Rabbit","Rat",2
        )
        questionsList.add(ques1)

        val ques2 = Question(
            2,"The main crops of Sikkim are?",R.drawable.crop,
            "rice, maize, bajra, wheat, barley, cardamom","sugarcane, tobacco, wheat, rice","chillies, oilseeds, groundnut, pepper","None of the above",1
        )
        questionsList.add(ques2)

        val ques3 = Question(
            3, "Pa(Pascal) is the unit for",R.drawable.pascal,
            "Thrust","Pressure","Frequency","Conductivity",2
        )
        questionsList.add(ques3)

        val ques4 = Question(
            1,"Which country does this flag belong to?",R.drawable.ic_flag_of_kuwait,
            "France","Belgium","Finland","Kuwait",4
        )
        questionsList.add(ques4)

        val ques5 = Question(
            5,"Number of commands of Air Force are",R.drawable.airforceimg,
            "Five","Six","Seven","Eight",3
        )
        questionsList.add(ques5)

        val ques6 = Question(
            6,"Who is well known collector of artefacts and curios?",R.drawable.artefacts,
            "Wadeyar","Salar Jung","Rabindranath Tagore","Motilal Nehru",3
        )
        questionsList.add(ques6)

        val ques7 = Question(
            7,"Professor Amartya Sen is famous in which of the fields?",R.drawable.amatyasen,
            "Biochemistry","Electronics","Economics","Geology",3
        )
        questionsList.add(ques7)

        val ques8 = Question(
            8,"Which country does this flag belong to?",R.drawable.ic_flag_of_denmark,
            "Denmark","Dominica","Ethiopia","Greece",1
        )
        questionsList.add(ques8)

        val ques9 = Question(
            9,"Which country does this flag belong to?",R.drawable.ic_flag_of_argentina,
            "Australia","Armenia","Egypt","Argentina",4
        )
        questionsList.add(ques9)

        val ques10 = Question(
            10,"The number of permanent members of the UN Security Council is",R.drawable.uncouncil,
            "Three","Four","Five","Six",3
        )
        questionsList.add(ques10)

        return questionsList

    }

}