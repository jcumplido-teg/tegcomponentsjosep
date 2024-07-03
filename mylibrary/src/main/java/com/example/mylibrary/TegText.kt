package com.example.mylibrary

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.sp

@Composable
fun TegText(text: String) {
    Text(text = text, fontSize = 30.sp)
}