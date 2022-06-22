package io.sharan.headspace.ui.screens

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import io.sharan.headspace.R

@Composable
fun Featured(featuredContent: FeaturedContent) {
    with(featuredContent) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(
                painter = painterResource(id = drawable),
                contentDescription = title,
                modifier = Modifier.clip(
                    RoundedCornerShape(8.dp)
                )
            )
            Text(text = title)
            Text(text = description)
            Button(
                onClick = {},
                modifier = Modifier
                    .padding(8.dp)
                    .clip(RoundedCornerShape(32.dp))
            ) {
                Row() {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_play),
                        contentDescription = null,
                        modifier = Modifier.padding(end = 4.dp)
                    )
                    Text(text = "Icon Button")
                }
            }
        }
    }
}

data class FeaturedContent(
    val title: String,
    @DrawableRes val drawable: Int,
    val description: String
)