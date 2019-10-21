package com.example.exampleclass1part2

import android.content.Context
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.fragment_form_view.*
import java.lang.RuntimeException

class SuccessView : Fragment() {
    private var listenerSuccessView: OnSuccessFragmentInteractionListener? =null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //return super.onCreateView(inflater, container, savedInstanceState)
        return LayoutInflater.from(container?.context).inflate(R.layout.fragment_success_view, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(context is OnSuccessFragmentInteractionListener){
            listenerSuccessView = context
        }else{
            throw RuntimeException(context.toString() + "implementar listener")
        }
    }
    fun onButtonPressed(uri: Uri){
        listenerSuccessView?.onSendClickInteraction()
    }

    interface OnSuccessFragmentInteractionListener{
        fun onSendClickInteraction()
    }
}
