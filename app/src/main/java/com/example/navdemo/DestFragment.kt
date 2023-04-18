package com.example.navdemo

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navdemo.databinding.FragmentDestBinding


class DestFragment : Fragment() {

   private lateinit var binding: FragmentDestBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentDestBinding.inflate(layoutInflater)
       var input:String? = requireArguments().getString("user_input")
        binding.textView2.text = input.toString()

        return binding.root
    }


}