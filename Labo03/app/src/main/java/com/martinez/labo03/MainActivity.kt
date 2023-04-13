package com.martinez.labo03

import android.graphics.drawable.AnimatedImageDrawable
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView


private lateinit var fiveCents: ImageView
private lateinit var tenCents: ImageView
private lateinit var quarterCents: ImageView
private lateinit var oneDollar: ImageView
private lateinit var calculateMoney: TextView
private var result: Double = 0.0


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bind()
        fiveCents.setOnClickListener { addMoney(0.05) }
        tenCents.setOnClickListener { addMoney(0.10) }
        quarterCents.setOnClickListener { addMoney(0.25) }
        oneDollar.setOnClickListener { addMoney(1.00) }
    }


    private fun addMoney(numb:Double){
        result+= numb
        calculateMoney.text = result.toString()
    }

    private fun bind () {
        fiveCents = findViewById(R.id.five_cents)
        tenCents = findViewById(R.id.ten_cents)
        quarterCents = findViewById(R.id.quarter_cents)
        oneDollar = findViewById(R.id.dollar)
        calculateMoney = findViewById(R.id.Text_amount)
    }
}

