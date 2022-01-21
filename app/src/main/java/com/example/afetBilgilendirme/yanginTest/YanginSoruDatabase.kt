package com.example.afetBilgilendirme.yanginTest

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.provider.BaseColumns

import java.util.ArrayList

import com.example.afetBilgilendirme.ortakTest.DatabaseSablon.QuizTable.Companion.ANS_COLUMN
import com.example.afetBilgilendirme.ortakTest.DatabaseSablon.QuizTable.Companion.OPTION1_COLUMN
import com.example.afetBilgilendirme.ortakTest.DatabaseSablon.QuizTable.Companion.OPTION2_COLUMN
import com.example.afetBilgilendirme.ortakTest.DatabaseSablon.QuizTable.Companion.OPTION3_COLUMN
import com.example.afetBilgilendirme.ortakTest.DatabaseSablon.QuizTable.Companion.OPTION4_COLUMN
import com.example.afetBilgilendirme.ortakTest.DatabaseSablon.QuizTable.Companion.QUESTION_COLUMN
import com.example.afetBilgilendirme.ortakTest.DatabaseSablon.QuizTable.Companion.QUESTION_TABLE_NAME
import com.example.afetBilgilendirme.ortakTest.SoruSablon



class YanginSoruDatabase(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    private var yangindb: SQLiteDatabase? = null

    val questionSet: List<SoruSablon>
        get() {

            val soruListesi = ArrayList<SoruSablon>()

            yangindb = readableDatabase

            val c = yangindb!!.rawQuery("SELECT * FROM $QUESTION_TABLE_NAME", null)

            if (c.moveToFirst()) {
                do {
                    val soru = SoruSablon()
                    soru.setmSoru(c.getString(c.getColumnIndex(QUESTION_COLUMN)))
                    soru.setmCevap1(c.getString(c.getColumnIndex(OPTION1_COLUMN)))
                    soru.setmCevap2(c.getString(c.getColumnIndex(OPTION2_COLUMN)))
                    soru.setmCevap3(c.getString(c.getColumnIndex(OPTION3_COLUMN)))
                    soru.setmCevap4(c.getString(c.getColumnIndex(OPTION4_COLUMN)))
                    soru.setmYanit(c.getInt(c.getColumnIndex(ANS_COLUMN)))
                    soruListesi.add(soru)
                } while (c.moveToNext())

            }
            c.close()
            return soruListesi
        }

    override fun onCreate(yangindb: SQLiteDatabase) {
        this.yangindb = yangindb

        val QB_TABLE = "CREATE TABLE " +
                QUESTION_TABLE_NAME + " ( " +
                BaseColumns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QUESTION_COLUMN + " TEXT, " +
                OPTION1_COLUMN + " TEXT, " +
                OPTION2_COLUMN + " TEXT, " +
                OPTION3_COLUMN + " TEXT, " +
                OPTION4_COLUMN + " TEXT, " +
                ANS_COLUMN + " INTEGER " +
                " )"

        yangindb.execSQL(QB_TABLE)

        SorulariOlustur()

    }

    private fun SorulariOlustur() {
        val q1 = SoruSablon(
            "Hangisi bir yangın sebebidir?",
            "İhmal",
            "Sabotaj",
            "Dikkatsizlik",
            "Hepsi",
            4
        )
        soruEkle(q1)
        val q2 = SoruSablon(
            "Hangisi yangınlarda oluşan yaralanma ve ölümlerin temel nedenidir?",
            "Alevlere maruz kalmak",
            "Binadan atlamak",
            "Duman zehirlenmesi",
            "Elektrik çarpması",
            3
        )
        soruEkle(q2)
        val q3 = SoruSablon(
            "Hangisi ara ara yapılması gereken bir yangın önlemi değildir?",
            "Eve ve iş yerine yangın dedektörü almak",
            "Yangın tatbikatı yapmak",
            "Elektrik düzeneklerini kontrol etmek",
            "Yangın tüplerini kontrol etmek",
            1
        )
        soruEkle(q3)
        val q4 = SoruSablon(
            "Hangisi evde çıkan yangınlarda yapılması gereken davranışlardan biri değildir?",
            "İtfaiyeyi arayıp detaylı bilgi vermek",
            "Dolaba veya yatağın altına saklanmak",
            "Kapı ve pencereyi kapalı tutmak",
            "Eğilerek veya sürünerek hareket etmek",
            2
        )
        soruEkle(q4)
        val q5 = SoruSablon(
            "Yangına dışarıdan bakan biriyseniz hangisini yapmanız gerekmez?",
            "İtfaiyeyi arayıp detaylı bilgi vermek",
            "Binayı biliyorsanız itfaiye görevlilerini bilgilendirmek",
            "İtfaiye gelene kadar içeridekilerin yardımına koşmak",
            "İtfaiye aracının kolay gelmesi için sokağın boşaltılmasına yardım etmek",
            3
        )
        soruEkle(q5)
    }

    private fun soruEkle(qb: SoruSablon) {
        val contentValues = ContentValues()
        contentValues.put(QUESTION_COLUMN, qb.getmSoru())
        contentValues.put(OPTION1_COLUMN, qb.getmCevap1())
        contentValues.put(OPTION2_COLUMN, qb.getmCevap2())
        contentValues.put(OPTION3_COLUMN, qb.getmCevap3())
        contentValues.put(OPTION4_COLUMN, qb.getmCevap4())
        contentValues.put(ANS_COLUMN, qb.getmYanit())
        yangindb!!.insert(QUESTION_TABLE_NAME, null, contentValues)
    }


    override fun onUpgrade(yangindb: SQLiteDatabase, oldVersion: Int, newVersion: Int) {

    }

    companion object {

        private val DATABASE_NAME = "QuizApp.yangindb"
        private val DATABASE_VERSION = 1
    }

}
