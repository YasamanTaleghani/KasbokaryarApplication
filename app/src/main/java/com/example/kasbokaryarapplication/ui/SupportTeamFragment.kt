package com.example.kasbokaryarapplication.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.kasbokaryarapplication.R
import com.example.kasbokaryarapplication.databinding.FragmentSupportTeamBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SupportTeamFragment : Fragment() {
    lateinit var binding: FragmentSupportTeamBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_support_team, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}