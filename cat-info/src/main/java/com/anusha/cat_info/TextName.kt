package com.anusha.cat_info

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight

@Composable
fun TextName() {

    Column(Modifier.fillMaxSize()) {
        Text(text = "You did it", fontWeight = FontWeight.Bold)
    }

}