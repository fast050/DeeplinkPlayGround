package com.example.deeplinkplayground.second

import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.deeplinkplayground.R
import com.example.deeplinkplayground.databinding.FragmentMainBinding
import com.example.deeplinkplayground.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    private var _binding : FragmentSecondBinding? = null
    val binding get() = _binding!!
    val args:SecondFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding =  FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

       // if (findNavController().graph.hasDeepLink(Uri.parse("https://dojoin.com/")))
        binding.textView.text = "dojoin"

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}