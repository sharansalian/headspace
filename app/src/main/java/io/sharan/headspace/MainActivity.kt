package io.sharan.headspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import io.sharan.headspace.ui.screens.Home
import io.sharan.headspace.ui.theme.HeadspaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HeadspaceTheme {
                Home()
            }
        }
    }
}
