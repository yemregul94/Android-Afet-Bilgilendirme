package com.example.afetBilgilendirme.depremTest

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


class DepremSoruDatabase(context: Context) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    private var depremdb: SQLiteDatabase? = null

    val questionSet: List<SoruSablon>
        get() {

            val soruListesi = ArrayList<SoruSablon>()

            depremdb = readableDatabase

            val c = depremdb!!.rawQuery("SELECT * FROM $QUESTION_TABLE_NAME", null)

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

    override fun onCreate(depremdb: SQLiteDatabase) {
        this.depremdb = depremdb

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

        depremdb.execSQL(QB_TABLE)

        SorulariOlustur()

    }

    private fun SorulariOlustur() {

        val q1 = SoruSablon(
            "Hangisi temel deprem ??antas??nda bulunmas?? gerekenlerden biri de??ildir?", "Su", "Battaniye",
            "Cep Telefonu", "Nakit Para", 3
        )
        soruEkle(q1)
        val q2 = SoruSablon(
            "Deprem s??ras??nda bina i??indeyseniz hangisini yapmak risklidir?", "Ayakta durmak", "Yere yatmak",
            "Masan??n alt??na ????kmek", "Ba????n??z?? elinizle veya bir cisimle korumak", 1
        )
        soruEkle(q2)
        val q3 = SoruSablon(
            "Deprem s??ras??nda hangisi yap??lmal??d??r?", "Sakin kal??p etraftakileri sakinle??tirmek", "Merdivenlere ko??mak",
            "AVM'de iseniz ????k????lar??na ko??mak", "Telefonla tan??d??klar?? aramak", 1
        )
        soruEkle(q3)
        val q4 = SoruSablon(
            "Deprem durduktan hemen sonra hangisini yapmak risklidir?", "Yerdeki kimyasallar?? temizlemek",
            "Yang??n kontrol?? yapmak", "Bina hasar??n?? kontrol etmek", "Hemen ????k????lara ko??mak", 4
        )
        soruEkle(q4)
        val q5 = SoruSablon(
            "Y??k??nt?? alt??nda mahsur kald??ysan??z hangisini yapmamal??s??n??z?", "A??z??n??z?? mendil veya k??yafet ile ??rtmek",
            "Etraf?? g??rmek i??in ??akmak yakmak", "D????ar?? seslenmek", "Boru, ta?? veya metal ile duvara vurmak", 2
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
        depremdb!!.insert(QUESTION_TABLE_NAME, null, contentValues)
    }


    override fun onUpgrade(depremdb: SQLiteDatabase, oldVersion: Int, newVersion: Int) {

    }

    companion object {

        private val DATABASE_NAME = "QuizApp.depremdb"
        private val DATABASE_VERSION = 1
    }

}
