package com.example.quizapppractise

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.SyncStateContract.Constants
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name:EditText=findViewById(R.id.Name)
        val submit: Button =findViewById(R.id.start)


        submit.setOnClickListener()
        {

            if(name.text.isEmpty())
                Toast.makeText(this,"Please enter your name",Toast.LENGTH_LONG).show()

            else {
                val i = Intent(this, QuizQuestions::class.java)
                i.putExtra(com.example.quizapppractise.Constants.USER_NAME,name.text.toString())
                startActivity(i)
                finish()
            }
        }




    }
}
