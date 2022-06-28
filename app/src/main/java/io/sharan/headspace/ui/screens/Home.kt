package io.sharan.headspace.ui.screens

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import io.sharan.headspace.R
import io.sharan.headspace.data.BottomNavItem
import io.sharan.headspace.ui.Navigation
import io.sharan.headspace.ui.theme.HeadspaceTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home() {
    HeadspaceTheme {
        val navController = rememberNavController()

        Scaffold(bottomBar = {
            HeadSpaceBottomNavigation(
                items = listOf(
                    BottomNavItem(
                        name = "Meditate",
                        route = "meditate",
                        drawable = R.drawable.ic_bottom_nav_meditate
                    ),
                    BottomNavItem(
                        name = "Focus",
                        route = "focus",
                        drawable = R.drawable.ic_bottom_nav_focus
                    )
                ),
                navController = navController,
                modifier = Modifier,
                onItemClick = {
                    navController.navigate(it.route)
                })
        }) {
            Navigation(navHostController = navController)
        }
    }
}

@Composable
fun HeadSpaceBottomNavigation(
    items: List<BottomNavItem>,
    navController: NavController,
    modifier: Modifier = Modifier,
    onItemClick: (BottomNavItem) -> Unit
) {
    val backStackEntry = navController.currentBackStackEntryAsState()
    NavigationBar {
        items.forEach {
            val selected = it.route == backStackEntry.value?.destination?.route
            NavigationBarItem(
                icon = {
                    Icon(
                        painter = painterResource(id = it.drawable),
                        contentDescription = it.name
                    )
                },
                label = {
                    Text(text = it.name)
                },
                selected = selected,
                onClick = { onItemClick(it) }
            )
        }
    }

}