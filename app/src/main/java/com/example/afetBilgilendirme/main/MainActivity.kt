package com.example.afetBilgilendirme.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.afetBilgilendirme.R
import com.example.afetBilgilendirme.depremTest.DepremTestActivity
import com.example.afetBilgilendirme.yanginTest.YanginTestActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionBar = supportActionBar
        actionBar?.hide();

        val depremButton = findViewById<Button>(R.id.depremButton)
        val yanginButton = findViewById<Button>(R.id.yanginButton)
        val depremTestButton = findViewById<Button>(R.id.depremTestButton)
        val yanginTestButton = findViewById<Button>(R.id.yanginTestButton)

        depremButton.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, DepremActivity::class.java);
            startActivity(intent);
        }

        yanginButton.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, YanginActivity::class.java);
            startActivity(intent);
        }

        depremTestButton.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, DepremTestActivity::class.java);
            startActivity(intent);
        }
        yanginTestButton.setOnClickListener {
            // Handler code here.
            val intent = Intent(this, YanginTestActivity::class.java);
            startActivity(intent);
        }
    }

}


