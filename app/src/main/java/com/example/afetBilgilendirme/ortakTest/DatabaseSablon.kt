package com.example.afetBilgilendirme.ortakTest

import android.provider.BaseColumns


object DatabaseSablon {

    class QuizTable : BaseColumns {
        companion object {

            val QUESTION_TABLE_NAME = "quiz_question"
            val QUESTION_COLUMN = "soru"
            val OPTION1_COLUMN = "cevap1"
            val OPTION2_COLUMN = "cevap2"
            val OPTION3_COLUMN = "cevap3"
            val OPTION4_COLUMN = "cevap4"
            val ANS_COLUMN = "yanit"
        }


    }


}
