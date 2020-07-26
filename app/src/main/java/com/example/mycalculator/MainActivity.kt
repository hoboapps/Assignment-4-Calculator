package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn0 = findViewById<Button>(R.id.btn0)
        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)
        val btn4 = findViewById<Button>(R.id.btn4)
        val btn5 = findViewById<Button>(R.id.btn5)
        val btn6 = findViewById<Button>(R.id.btn6)
        val btn7 = findViewById<Button>(R.id.btn7)
        val btn8 = findViewById<Button>(R.id.btn8)
        val btn9 = findViewById<Button>(R.id.btn9)
        val btnAc = findViewById<Button>(R.id.btnAc)
        val result =findViewById<TextView>(R.id.result)

        result.text = ""

        btnAc.setOnClickListener {
            result.text = ""
        }





    }

    fun numberEvent(view: View){

        if (newOperation){

            result.setText("")
        }

           newOperation = false

        val selectNumber = view as Button
        var numberClicked:String = result.text.toString()
        when (selectNumber.id){

            btn0.id->{

                numberClicked += "0"
            }
            btn1.id->{

                numberClicked += "1"
            }
            btn2.id->{

                numberClicked += "2"
            }
            btn3.id->{

                numberClicked += "3"
            }
            btn4.id->{

                numberClicked += "4"
            }
            btn5.id->{

                numberClicked += "5"
            }
            btn6.id->{

                numberClicked += "6"
            }
            btn7.id->{

                numberClicked += "7"

            }  btn8.id->{

            numberClicked += "8"

        }  btn9.id->{

            numberClicked += "9"
        }
            btnDecimal.id->{

                numberClicked += "."
            }


        }

        result.setText(numberClicked)


    }

    var op = "*"
    var storeNumbers =""
    var newOperation = true

    fun operationEvent(view: View){


        val selectOp = view as Button
        when (selectOp.id){

            btnDivide.id -> {
                op = "/"
            }
            btnMultiply.id -> {
                op = "*"
            }
            btnSubtract.id -> {
                op = "-"
            }
            btnAddition.id -> {
                op = "/"
            }






        }
            storeNumbers = result.text.toString()
            newOperation = true

    }

    fun equalOperation(view: View){

        val newNumber = result.text.toString()
        var correctAnswer:Double? =null
        when(op){

            "/"->{

                correctAnswer = storeNumbers.toDouble()/ newNumber.toDouble()

            }
            "*"->{
                correctAnswer = storeNumbers.toDouble()*newNumber.toDouble()
            }
            "-"->{
                correctAnswer = storeNumbers.toDouble()- newNumber.toDouble()
            }
            "+"->{
                correctAnswer = storeNumbers.toDouble() + newNumber.toDouble()
            }
        }

        result.setText(correctAnswer.toString())
        newOperation=true
    }



}


