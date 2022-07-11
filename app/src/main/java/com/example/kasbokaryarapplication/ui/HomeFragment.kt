package com.example.kasbokaryarapplication.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.kasbokaryarapplication.R
import com.example.kasbokaryarapplication.databinding.FragmentMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment() {
    lateinit var binding: FragmentMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.moreCard1.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_modernTechFragment)
        }
        binding.moreCard2.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_agileTechFragment)
        }
        binding.moreCard3.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_supportTeamFragment)
        }
        binding.moreAbout.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_detailsFragment)
        }
    }
}