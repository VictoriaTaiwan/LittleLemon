package com.example.little_lemon.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Surface
import com.iries.littlelemon.presentation.nav.Navigation
import com.iries.littlelemon.presentation.theme.LittleLemonTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        setContent {
            LittleLemonTheme {
                Surface {
                    Navigation()
                }
            }
        }
    }

}