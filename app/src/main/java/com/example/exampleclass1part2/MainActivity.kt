package com.example.exampleclass1part2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity(), SuccessView.OnSuccessFragmentInteractionListener {
    override fun onSendClickInteraction() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadForm(FragmentFormView())
    }
    private fun loadForm(fr:FragmentFormView){
        val formu: FragmentTransaction = supportFragmentManager.beginTransaction()
        formu.replace(R.id.fragment, fr)
        formu.commit()
    }
}
