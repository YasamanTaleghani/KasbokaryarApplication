package com.example.kasbokaryarapplication.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.kasbokaryarapplication.R
import com.example.kasbokaryarapplication.databinding.FragmentEducationBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class EducationFragment : Fragment() {
    lateinit var binding: FragmentEducationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_education, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val identifier: Int = requireContext().resources.getIdentifier("career_exam", "raw", requireContext().packageName)
        if (identifier > 0) {
            binding.image1.setImageResource(identifier)
        }
    }
}