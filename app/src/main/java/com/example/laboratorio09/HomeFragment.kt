package com.example.laboratorio09

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //TODO: Use binding to navigate to the other fragments
        binding.mainThreadButton.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_mainThreadFragment)
        }

        binding.coroutinesButton.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_coroutinesFragment)
        }
    }
}