package com.furkanekiz.navigationdemo

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.furkanekiz.navigationdemo.databinding.FrHomeBinding


class FRHome : Fragment() {

    private lateinit var binding: FrHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {

        binding = DataBindingUtil.inflate(inflater, R.layout.fr_home, container, false)

        binding.btnFRHome.setOnClickListener {
            if (!TextUtils.isEmpty(binding.etFRHome.text.toString())) {
                val bundle: Bundle = bundleOf("user_input" to binding.etFRHome.text.toString())
                it.findNavController().navigate(R.id.action_FRHome_to_FRSecond, bundle)
            } else {
                Toast.makeText(activity, "Please insert your name", Toast.LENGTH_LONG).show()
            }
        }

        return binding.root
    }

}