package com.example.notesapp.feature_note.presentation.note.components

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.notesapp.R

@Composable
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
fun AppInfo(navController: NavController) {
    Scaffold(
        topBar =
        {
            TopAppBar(title = { Text(text = "About", fontFamily = FontFamily(Font(R.font.robotocondensed_bold))) },
                modifier = Modifier.padding(10.dp,0.dp,10.dp,2.dp))
        }
    ){
        Column(modifier = Modifier.padding(it))
        {
            Divider()
            Text(modifier = Modifier.padding(12.dp),text = "Developer = DELTAKIRA", fontSize = 14.sp, fontFamily = FontFamily(Font(R.font.robotocondensed_bold)))
            Divider(modifier = Modifier.padding(12.dp))
            Text(modifier = Modifier.padding(20.dp),text = "Elevate your note-taking experience with our Notes App, a sleek and intuitive solution developed using Jetpack Compose for a modern UI, Material 3 design for a polished aesthetic, Clean Architecture for robust structure, and Room database for seamless data management. Stay organized effortlessly and enjoy a seamless user experience with our feature-rich application", fontSize = 12.sp, fontFamily = FontFamily(Font(R.font.custom_sans)))
            Divider(modifier = Modifier.padding(12.dp))

        }
    }
}