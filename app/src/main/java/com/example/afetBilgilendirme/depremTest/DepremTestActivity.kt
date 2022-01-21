package com.example.afetBilgilendirme.depremTest

import android.content.res.ColorStateList
import android.graphics.Color

import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast


import java.util.Collections.shuffle


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.afetBilgilendirme.R
import com.example.afetBilgilendirme.ortakTest.SoruSablon


class DepremTestActivity : AppCompatActivity() {

    private var txtSoru: TextView? = null

    private var radioGroup: RadioGroup? = null
    private var cevap1: RadioButton? = null
    private var cevap2: RadioButton? = null
    private var cevap3: RadioButton? = null
    private var cevap4: RadioButton? = null
    private var onay: Button? = null

    private var standartRenk: ColorStateList? = null
    
    private var soruListesi: List<SoruSablon>?=null

    private var soruSayac: Int = 0
    private var mevcutSoru: SoruSablon? = null
    private var toplamSoru: Int = 0

    private var puan: Int = 0
    private var yanit: Boolean = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.deprem_test)

        val actionBar = supportActionBar
        actionBar?.hide();

    txtSoru = findViewById(R.id.SoruText)

    radioGroup = findViewById(R.id.cevapRadioGroup)
    cevap1 = findViewById(R.id.cevap1radio)
    cevap2 = findViewById(R.id.cevap2radio)
    cevap3 = findViewById(R.id.cevap3radio)
    cevap4 = findViewById(R.id.cevap4radio)
    onay = findViewById(R.id.onaylaButton)
        
    standartRenk = cevap1!!.textColors

    val soruDB = DepremSoruDatabase(this)
    soruListesi = soruDB.questionSet

    toplamSoru = soruListesi!!.size

    shuffle(soruListesi!!)

    soruGoster()

    onay!!.setOnClickListener {
        if (!yanit) {
            if (cevap1!!.isChecked || cevap2!!.isChecked || cevap3!!.isChecked || cevap4!!.isChecked) {
                kontrolEt()
            } else {
                Toast.makeText(this, "Cevabı Seçin", Toast.LENGTH_SHORT).show()
            }
        } else {
            soruGoster()
        }
    }
    }

    private fun soruGoster() {

        cevap1!!.setTextColor(standartRenk)
        cevap2!!.setTextColor(standartRenk)
        cevap3!!.setTextColor(standartRenk)
        cevap4!!.setTextColor(standartRenk)

        radioGroup!!.clearCheck()


        if (soruSayac < toplamSoru) {
            mevcutSoru = soruListesi!![soruSayac]
            txtSoru!!.text = mevcutSoru!!.getmSoru()

            cevap1!!.text = mevcutSoru!!.getmCevap1()
            cevap2!!.text = mevcutSoru!!.getmCevap2()
            cevap3!!.text = mevcutSoru!!.getmCevap3()
            cevap4!!.text = mevcutSoru!!.getmCevap4()

            soruSayac++

            yanit = false

            onay!!.text = "Onayla"

        } else {
            finishQuizActivity()
        }

    }


    private fun kontrolEt() {
        yanit = true

        val radioSelected = findViewById<View>(radioGroup!!.checkedRadioButtonId) as RadioButton
        val myanit = radioGroup!!.indexOfChild(radioSelected) + 1

        if (myanit == mevcutSoru!!.getmYanit()) {
            puan++
            txtSoru!!.text = "Cevap Doğru"
        }
        else {
            txtSoru!!.text = "Cevap Yanlış"
        }

        cevapGoster()

    }

    private fun cevapGoster() {

        cevap1!!.setTextColor(Color.RED)
        cevap2!!.setTextColor(Color.RED)
        cevap3!!.setTextColor(Color.RED)
        cevap4!!.setTextColor(Color.RED)

        when (mevcutSoru!!.getmYanit()) {
            1 -> {
                cevap1!!.setTextColor(Color.GREEN)
            }
            2 -> {
                cevap2!!.setTextColor(Color.GREEN)
            }
            3 -> {
                cevap3!!.setTextColor(Color.GREEN)
            }
            4 -> {
                cevap4!!.setTextColor(Color.GREEN)
            }
        }

        if (soruSayac < toplamSoru) {
            onay!!.text = "Sıradaki"
        } else {
            onay!!.text = "Testi Bitir"
            txtSoru!!.append("\n\nPuanınız: " + puan + "/" + toplamSoru)
        }
    }

    private fun finishQuizActivity() {

        //Toast.makeText(this, "Puanınız: " + puan + "/" + toplamSoru , Toast.LENGTH_LONG).show()
        finish()
    }



}