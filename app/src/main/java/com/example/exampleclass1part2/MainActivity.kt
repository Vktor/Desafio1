package com.example.exampleclass1part2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // loadForm(formulario())
    }
    private fun loadForm(fr:formulario){
        val formu: FragmentTransaction = supportFragmentManager.beginTransaction()
        formu.replace(R.id.fragment, fr)
        formu.addToBackStack(null)
        formu.commit()
    }
}
