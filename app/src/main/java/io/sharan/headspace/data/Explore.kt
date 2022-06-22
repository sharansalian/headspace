package io.sharan.headspace.data

import androidx.annotation.DrawableRes
import io.sharan.headspace.R

data class Explore(val title: String, val description: String, @DrawableRes val drawable: Int)


fun getAllExploreContent() = listOf<Explore>(
    Explore(
        title = "Courses and Singles",
        description = "Guided meditations for any moment.",
        drawable = R.drawable.ic_explore_content_1
    ),
    Explore(
        title = "New and popular",
        description = "The latest meditations and top picks from our team.",
        drawable = R.drawable.ic_explore_content_2
    )
)
