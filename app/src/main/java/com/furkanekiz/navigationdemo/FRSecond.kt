package com.furkanekiz.navigationdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.furkanekiz.navigationdemo.databinding.FrSecondBinding

class FRSecond : Fragment() {

    private lateinit var binding: FrSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = DataBindingUtil.inflate(inflater, R.layout.fr_second, container, false)

        val input = requireArguments().getString("user_input")
        binding.tvFRSecond.text = input.toString()

        return binding.root
    }


}