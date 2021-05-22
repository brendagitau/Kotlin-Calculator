package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var number1 = findViewById<EditText>(R.id.number1)
        var number2 = findViewById<EditText>(R.id.number2)
        var result1 = findViewById<TextView>(R.id.result)
        var buttonAdd = findViewById<Button>(R.id.buttonAdd)
        var buttonSubtract = findViewById<Button>(R.id.buttonSubtract)
        var buttonMultiply = findViewById<Button>(R.id.buttonMultiply)
        var buttonDivide = findViewById<Button>(R.id.buttonDivide)



       buttonAdd.setOnClickListener(){
           var num1 = number1.text.toString()
           var num2 = number2.text.toString()

           val result:Int=add(num1,num2)

           result1.text=(result.toString())


       }

        buttonSubtract.setOnClickListener(){
            var num1 = number1.text.toString()
            var num2 = number2.text.toString()

            val result:Int=subtract(num1,num2)
            result1.text=(result.toString())
        }

        buttonMultiply.setOnClickListener(){
            var num1 = number1.text.toString()
            var num2 = number2.text.toString()

            val result:Int=multiply(num1,num2)
            result1.text=(result.toString())
        }

        buttonDivide.setOnClickListener(){
            var num1 = number1.text.toString()
            var num2 = number2.text.toString()

            val result:Int=divide(num1,num2)
            result1.text=(result.toString())
        }

    }

    private fun divide(num1: String, num2: String): Int {
        // convert string to integer
        val a:Int=Integer.parseInt(num1)
        val b:Int=Integer.parseInt(num2)
        val div:Int=a/b
        return div

    }

    private fun multiply(num1: String, num2: String): Int {
        // convert string to integer
        val a:Int=Integer.parseInt(num1)
        val b:Int=Integer.parseInt(num2)
        val mult:Int=a*b
        return mult

    }

    private fun subtract(num1: String, num2: String): Int {
        // convert string to integer
        val a:Int=Integer.parseInt(num1)
        val b:Int=Integer.parseInt(num2)
        val subt:Int=a-b
        return subt

    }

    private fun add(num1: String, num2: String): Int {
        // convert string to integer
        val a:Int=Integer.parseInt(num1)
        val b:Int=Integer.parseInt(num2)
        val sum:Int=a+b;
        return sum
    }
}