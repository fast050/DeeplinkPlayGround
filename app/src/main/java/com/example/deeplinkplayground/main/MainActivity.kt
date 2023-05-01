package com.example.deeplinkplayground.main

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.FragmentContainer
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.deeplinkplayground.R
import com.example.deeplinkplayground.databinding.ActivityMainBinding
import com.example.deeplinkplayground.utils.showMessage

class MainActivity : AppCompatActivity() {

    lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val action: String? = intent?.action
        val data: Uri? = intent?.data

        showMessage(this, data.toString())

        val navHostFragment = supportFragmentManager.findFragmentById(binding.fragmentContainerView.id) as NavHostFragment

        navController = navHostFragment.navController
    }

}