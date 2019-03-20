package com.example.myapplication

import android.os.Bundle

import android.support.v7.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        add.setOnClickListener {
            val a=op1.text.toString().toInt()
            val b=op2.text.toString().toInt()
            result.setText((a+b).toString())
        }
        mul.setOnClickListener {
            val a=op1.text.toString().toInt()
            val b=op2.text.toString().toInt()
            result.setText((a*b).toString())
        }
        sub.setOnClickListener {
            val a=op1.text.toString().toInt()
            val b=op2.text.toString().toInt()
            result.setText((a-b).toString())
        }

        div.setOnClickListener {

            val a=op1.text.toString().toInt()
            val b=op2.text.toString().toInt()
            if(b==0)
                result.setText("Impossibile")
            else
                result.setText((a/b).toString())
        }
        //    result.text= somma(op1,op2)
        //  }
        //  private fun somma(a: Int,b: Int): Int {
        //  return a+b
        //  }
    }
}
