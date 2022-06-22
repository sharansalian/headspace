package io.sharan.headspace.ui.screens

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import io.sharan.headspace.R
import io.sharan.headspace.ui.theme.HeadspaceTheme

@Composable
fun Home() {
    HeadspaceTheme {
        Scaffold(bottomBar = { HeadSpaceBottomNavigation() }) { padding ->


        }
    }
}

@Composable
fun HeadSpaceBottomNavigation(modifier: Modifier = Modifier) {
    BottomNavigation(
        backgroundColor = MaterialTheme.colors.background,
        modifier = modifier
    ) {
        BottomNavigationItem(
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_bottom_nav_meditate),
                    contentDescription = "Meditate"
                )
            },
            label = {
                Text(text = "Meditate")
            },
            selected = false,
            onClick = {}
        )
        BottomNavigationItem(
            icon = {
                Icon(
                    painter = painterResource(id = R.drawable.ic_bottom_nav_focus),
                    contentDescription = "Focus"
                )
            },
            label = {
                Text(text = "Focus")
            },
            selected = true,
            onClick = { /*TODO*/ }
        )
    }

}