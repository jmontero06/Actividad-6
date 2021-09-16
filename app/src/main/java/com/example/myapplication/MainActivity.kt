package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random
import kotlin.random.nextInt


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun mayor(arg: IntArray): Int {
            var may=arg[0]
            var num=1
            while (num<arg.size){
                if (arg[num]>may){
                    may=arg[num]
                }
                num++
            }
            return may
        }
        fun menor(arg: IntArray): Int {
            var men=arg[0]
            var num=1
            while (num<arg.size){
                if(arg[num]<men){
                    men=arg[num]
                }
                num++
            }
            return men
        }
        fun promedio(arg: IntArray): Float {
            var sum=0
            var num=0
            while (num<arg.size){
                sum += arg[num]
                num++
            }
            return (sum.toFloat()/10)
        }

        //creamos las variables para enlasar los componentes del activity main
        val btn:Button=findViewById(R.id.btnGenerar)
        val txvArreglo:TextView=findViewById(R.id.txvArreglo)
        val txvPromedio:TextView=findViewById(R.id.txvPromedio)
        val txvMayor:TextView=findViewById(R.id.txvMayor)
        val txvMenor:TextView=findViewById(R.id.txvMenor)

        //funcion click del boton generar
        btn.setOnClickListener{
            var arg=IntArray(10)
            var txvget:String
            var num=0
            while (num<10){
                arg[num]= Random.nextInt(1..100)
                num++
            }
            num=0
            txvArreglo.text = "el arreglo es el siguiente: "
            while (num<arg.size){
                txvget="${txvArreglo.text.toString()} ${arg[num].toString()}"
                txvArreglo.text = txvget
                num++
            }
            txvPromedio.text="el promedio es: ${promedio(arg).toString()}"
            txvMayor.text="el numero mayor es: ${mayor(arg).toString()}"
            txvMenor.text="el numero menor es: ${menor(arg).toString()}"
        }
    }
}