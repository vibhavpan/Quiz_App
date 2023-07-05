package com.example.quizapppractise

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

var name:TextView?=null
var score:TextView?=null

class Result : AppCompatActivity() {
    //@SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        name=findViewById(R.id.Name)
        score=findViewById(R.id.score)

        setData()
    }

    public fun setData()
    {
        val User_Name:String?=intent.getStringExtra(Constants.USER_NAME)
        val User_Score:Int?=intent.getIntExtra(Constants.SCORE,0)

        name!!.setText("Hello "+User_Name)
        score!!.setText("Your score is "+ User_Score+"/"+Constants.totalQuestions)

    }
}
