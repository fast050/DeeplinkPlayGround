package com.example.deeplinkplayground.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentContainer
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.deeplinkplayground.R
import com.example.deeplinkplayground.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(binding.fragmentContainerView.id) as NavHostFragment

        navController = navHostFragment.navController
    }

}