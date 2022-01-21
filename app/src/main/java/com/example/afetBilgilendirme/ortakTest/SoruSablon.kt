package com.example.afetBilgilendirme.ortakTest

class SoruSablon {

    private var mSoru: String? = null
    private var mCevap1: String? = null
    private var mCevap2: String? = null
    private var mCevap3: String? = null
    private var mCevap4: String? = null
    private var mYanit: Int = 0

    constructor() {}

    constructor(mSoru: String, mCevap1: String, mCevap2: String, mCevap3: String, mCevap4: String, mYanit: Int) {
        this.mSoru = mSoru
        this.mCevap1 = mCevap1
        this.mCevap2 = mCevap2
        this.mCevap3 = mCevap3
        this.mCevap4 = mCevap4
        this.mYanit = mYanit
    }

    fun getmSoru(): String? {
        return mSoru
    }

    fun setmSoru(mSoru: String) {
        this.mSoru = mSoru
    }

    fun getmCevap1(): String? {
        return mCevap1
    }

    fun setmCevap1(mCevap1: String) {
        this.mCevap1 = mCevap1
    }

    fun getmCevap2(): String? {
        return mCevap2
    }

    fun setmCevap2(mCevap2: String) {
        this.mCevap2 = mCevap2
    }

    fun getmCevap3(): String? {
        return mCevap3
    }

    fun setmCevap3(mCevap3: String) {
        this.mCevap3 = mCevap3
    }

    fun getmCevap4(): String? {
        return mCevap4
    }

    fun setmCevap4(mCevap4: String) {
        this.mCevap4 = mCevap4
    }

    fun getmYanit(): Int {
        return mYanit
    }

    fun setmYanit(mYanit: Int) {
        this.mYanit = mYanit
    }

}
