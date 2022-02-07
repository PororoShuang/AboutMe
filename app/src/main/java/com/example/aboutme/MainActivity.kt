package com.example.aboutme

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDone: Button =findViewById(R.id.btnDone)
        val tfNickname : TextView = findViewById(R.id.tfNickname)
        val tvNickName:TextView = findViewById(R.id.tvNickname)

         btnDone.setOnClickListener(){

             val nickName = tfNickname.text.toString()
             tvNickName.text = nickName

             tvNickName.visibility = View.VISIBLE
             btnDone.visibility = View.GONE
             tfNickname.visibility = View.GONE

             //Hide the keyboard
             val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
             inputMethodManager.hideSoftInputFromWindow(it.windowToken, 0)
    }

        tvNickName.setOnClickListener {
            btnDone.visibility= View.VISIBLE
            tfNickname.visibility= View.VISIBLE
            tvNickName.visibility=View.GONE

            tfNickname.requestFocus()

            //Show the keyboard
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.showSoftInput(tfNickname, 0)

        }


    }
}