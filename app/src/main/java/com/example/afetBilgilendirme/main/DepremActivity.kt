package com.example.afetBilgilendirme.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.afetBilgilendirme.R
import com.example.afetBilgilendirme.adapter.DepremAdapter
import com.example.afetBilgilendirme.deprem.deprem1
import com.example.afetBilgilendirme.deprem.deprem2
import com.example.afetBilgilendirme.deprem.deprem3
import com.google.android.material.tabs.TabLayout

class DepremActivity: AppCompatActivity() {

    private lateinit var viewPager: ViewPager
    private lateinit var tabs: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.deprem_main)

        val actionBar = supportActionBar
        actionBar?.hide();

        viewPager = findViewById(R.id.depremPager)
        tabs = findViewById(R.id.depremTabs)


        val sayfa1 = deprem1();
        val sayfa2 = deprem2();
        val sayfa3 = deprem3();

        val adapter = DepremAdapter(supportFragmentManager);

        adapter.addFragment(fragment = sayfa1, title =  "Deprem Öncesi")
        adapter.addFragment(fragment = sayfa2, title =  "Deprem Sırası")
        adapter.addFragment(fragment = sayfa3, title =  "Deprem Sonrası")

        viewPager.adapter = adapter;

        tabs!!.setupWithViewPager(viewPager)
    }
}

