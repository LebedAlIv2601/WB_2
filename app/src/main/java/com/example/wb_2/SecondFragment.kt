package com.example.wb_2

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import com.example.wb_2.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private var binding: FragmentSecondBinding? = null

    override fun onAttach(context: Context) {
        Log.d("SecondFragment lifecycle", "onAttach()")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("SecondFragment lifecycle", "onCreate()")
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Log.d("SecondFragment lifecycle", "onCreateView()")
        binding = FragmentSecondBinding.inflate(inflater, container, false)


        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("SecondFragment lifecycle", "onViewCreated()")

        binding?.apply {
            buttonShowAlertDialog.setOnClickListener {
                context?.let { contextIn ->
                    AlertDialog.Builder(contextIn)
                        .setTitle(getString(R.string.alert_dialog_title))
                        .setMessage(getString(R.string.alert_dialog_message))
                        .setNegativeButton(getString(R.string.alert_dialog_button_text), null)
                        .show()
                }
            }
        }
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d("SecondFragment lifecycle", "onViewStateRestored()")
    }

    override fun onStart() {
        super.onStart()
        Log.d("SecondFragment lifecycle", "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d("SecondFragment lifecycle", "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("SecondFragment lifecycle", "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("SecondFragment lifecycle", "onStop()")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("SecondFragment lifecycle", "onSaveInstanceState()")
    }



    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
        Log.d("SecondFragment lifecycle", "onDestroyView()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("SecondFragment lifecycle", "onDestroy()")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("SecondFragment lifecycle", "onDetach()")
    }
}