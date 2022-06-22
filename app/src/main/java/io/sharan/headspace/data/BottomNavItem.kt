package io.sharan.headspace.data

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavItem(val name: String, val route: String, @DrawableRes val drawable: Int)
