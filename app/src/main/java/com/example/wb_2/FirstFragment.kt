package com.example.wb_2

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wb_2.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private var binding: FragmentFirstBinding? = null

    override fun onAttach(context: Context) {
        Log.d("FirstFragment lifecycle", "onAttach()")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("FirstFragment lifecycle", "onCreate()")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Log.d("FirstFragment lifecycle", "onCreateView()")

        binding = FragmentFirstBinding.inflate(inflater, container, false)

        binding?.buttonGoToSecondFragment?.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .add(R.id.fragment_container, SecondFragment())
                .hide(this)
                .addToBackStack(null)
                .commit()
        }
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("FirstFragment lifecycle", "onViewCreated()")

    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        Log.d("FirstFragment lifecycle", "onViewStateRestored()")
    }

    override fun onStart() {
        super.onStart()
        Log.d("FirstFragment lifecycle", "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d("FirstFragment lifecycle", "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("FirstFragment lifecycle", "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("FirstFragment lifecycle", "onStop()")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d("FirstFragment lifecycle", "onSaveInstanceState()")
    }



    override fun onDestroyView() {
        binding = null
        super.onDestroyView()
        Log.d("FirstFragment lifecycle", "onDestroyView()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("FirstFragment lifecycle", "onDestroy()")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("FirstFragment lifecycle", "onDetach()")
    }
}