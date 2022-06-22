package io.sharan.headspace.ui.screens

import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import io.sharan.headspace.data.BottomNavItem
import io.sharan.headspace.ui.theme.HeadspaceTheme
import io.sharan.headspace.R
import io.sharan.headspace.ui.Navigation

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
        }) { padding ->
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
    BottomNavigation(
        backgroundColor = MaterialTheme.colors.background,
        modifier = modifier,
        elevation = 5.dp
    ) {
        items.forEach {
            val selected = it.route == backStackEntry.value?.destination?.route
            BottomNavigationItem(
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
                selectedContentColor = MaterialTheme.colors.primary,
                unselectedContentColor = Color.Gray,
                onClick = { onItemClick(it) }
            )
        }
    }

}