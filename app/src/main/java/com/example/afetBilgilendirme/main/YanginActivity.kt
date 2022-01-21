package com.example.afetBilgilendirme.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.afetBilgilendirme.R
import com.example.afetBilgilendirme.adapter.YanginAdapter
import com.example.afetBilgilendirme.yangin.yangin1
import com.example.afetBilgilendirme.yangin.yangin2
import com.example.afetBilgilendirme.yangin.yangin3
import com.google.android.material.tabs.TabLayout


class YanginActivity: AppCompatActivity() {

    private lateinit var viewPager: ViewPager
    private lateinit var tabs: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.yangin_main)

        val actionBar = supportActionBar
        actionBar?.hide();

        viewPager = findViewById(R.id.yanginPager)
        tabs = findViewById(R.id.yanginTabs)


        val sayfa1 = yangin1();
        val sayfa2 = yangin2();
        val sayfa3 = yangin3();

        val adapter = YanginAdapter(supportFragmentManager);

        adapter.addFragment(fragment = sayfa1, title =  "Yangın Nedenleri")
        adapter.addFragment(fragment = sayfa2, title =  "Yangın Öncesi")
        adapter.addFragment(fragment = sayfa3, title =  "Yangın Sırası")

        viewPager.adapter = adapter;

        tabs!!.setupWithViewPager(viewPager)

    }



}

