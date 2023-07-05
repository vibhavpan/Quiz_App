package com.example.quizapppractise

import android.content.Intent
import android.graphics.Color
import android.graphics.ImageDecoder
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import com.example.quizapppractise.Result
import org.w3c.dom.Text
import java.util.Objects
import kotlin.concurrent.thread

class QuizQuestions : AppCompatActivity(), View.OnClickListener {

    var option1:TextView?=null
    var option2:TextView?=null
    var option3:TextView?=null
    var progressBar:ProgressBar?=null
    var image:ImageView?=null
    var progressText:TextView?=null

    private var submit:Button?=null
    private var score:Int=0

    var currentQuestion:Int=0

    var selectedAnswer=0

    var correctAnswer=0
    var size=0

    var User_Name:String?=null

    fun makeQuestion( )
    {
        currentQuestion++

        progressCheck(currentQuestion)

        if(currentQuestion==1)
        {
            option1?.setText("America")
            option2?.setText("Japan")
            option3?.setText("Germany")
            image?.setImageResource(R.drawable.america)

            correctAnswer=1
        }

        if(currentQuestion==2)
        {
            option1?.setText("Russia")
            option2?.setText("Indian")
            option3?.setText("Germany")
            image?.setImageResource(R.drawable.indian)

            correctAnswer=2
        }

        if(currentQuestion==3)
        {
            option1?.setText("Ukraine")
            option2?.setText("Italy")
            option3?.setText("America")
            image?.setImageResource(R.drawable.italy)

            correctAnswer=2
        }

        if(currentQuestion==4)
        {
            option1?.setText("Japan")
            option2?.setText("Italy")
            option3?.setText("Uganda")
            image?.setImageResource(R.drawable.japan)

            correctAnswer=1
        }

        if(currentQuestion==5)
        {
            option1?.setText("New Zealand")
            option2?.setText("Norway")
            option3?.setText("Netherlands")
            image?.setImageResource(R.drawable.netherlands)

            correctAnswer=3
        }
        if(currentQuestion==6)
        {
            option1?.setText("Greece")
            option2?.setText("Ghana")
            option3?.setText("Germany")
            image?.setImageResource(R.drawable.germany)

            correctAnswer=3
        }

    }

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        option1=findViewById(R.id.option1)
        option2=findViewById(R.id.option2)
        option3=findViewById(R.id.option3)
        progressBar=findViewById(R.id.progressBar4)
        image=findViewById(R.id.image)
        progressText=findViewById(R.id.tv_progress)
        submit=findViewById(R.id.answer)

        option1?.setOnClickListener (this)

        User_Name=intent.getStringExtra(Constants.USER_NAME)

        option2?.setOnClickListener (this)

        makeQuestion()

        option3?.setOnClickListener (this)
        submit?.setOnClickListener(this)

    }
    private fun progressCheck(currentQuestionNumber:Int)
    {
        progressBar?.setMax(Constants.totalQuestions)
        progressBar?.setProgress(currentQuestionNumber)
        progressText?.setText(currentQuestionNumber.toString()+"/"+Constants.totalQuestions)
    }
    private fun setDefault()
    {
        option1?.setBackgroundColor(Color.GRAY)
        option2?.setBackgroundColor(Color.GRAY)
        option3?.setBackgroundColor(Color.GRAY)
    }
    //TODO:Transfter user name to result via QuizQuestions

    override fun onClick(v: View?)
    {

        if (v == option1) {
            option1?.setBackgroundColor(Color.BLUE)
            option2?.setBackgroundColor(Color.GRAY)
            option3?.setBackgroundColor(Color.GRAY)

            selectedAnswer = 1

        }

        if (v == option2) {

            option2?.setBackgroundColor(Color.BLUE)
            option1?.setBackgroundColor(Color.GRAY)
            option3?.setBackgroundColor(Color.GRAY)

            selectedAnswer = 2

            //Toast.makeText(this,"Incorrect",Toast.LENGTH_LONG)
        }


        if (v == option3) {
            option3?.setBackgroundColor(Color.BLUE)
            option2?.setBackgroundColor(Color.GRAY)
            option1?.setBackgroundColor(Color.GRAY)

            selectedAnswer = 3

        }

        if (v == submit )
        {
            if(selectedAnswer==correctAnswer)
            {
                //Toast.makeText(this, "Correct,goog job!!", Toast.LENGTH_LONG).show()
                score++

                if(currentQuestion==Constants.totalQuestions)
                    moveToResultActivity()

                setDefault()
                makeQuestion()

            }

           else if(selectedAnswer!=correctAnswer)
                if(currentQuestion==Constants.totalQuestions)
                    moveToResultActivity()

                else
                {
                    setDefault()
                    makeQuestion()
                }
            }

        }


    private fun moveToResultActivity()
    {
        val i = Intent(this, Result::class.java)
        //i.putExtra("score",score)
        i.putExtra(Constants.USER_NAME,User_Name)
        i.putExtra(Constants.SCORE,score)

        startActivity(i)
        finish()
    }


}



