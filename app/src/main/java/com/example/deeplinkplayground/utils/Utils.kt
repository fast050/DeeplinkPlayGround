package com.example.deeplinkplayground.utils

import android.content.Context
import android.widget.Toast


fun showMessage(context: Context, message: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(context, message, duration).show()
}

