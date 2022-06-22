package io.sharan.headspace.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import io.sharan.headspace.R
import io.sharan.headspace.data.Explore
import io.sharan.headspace.data.getAllExploreContent
import io.sharan.headspace.ui.theme.Background

@Composable
fun MeditateScreen() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        HomeSection("Explore Meditation", modifier = Modifier) {
            ExploreMeditation()
        }
    }
}


@Composable
fun ExploreMeditation(courses: List<Explore> = getAllExploreContent()) {
    LazyColumn(modifier = Modifier.padding(4.dp)) {
        items(items = courses) {
            ExploreItem(explore = it)
        }
    }
}

@Composable
fun ExploreItem(explore: Explore) {
    Card(
        backgroundColor = Background,
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp)
    ) {
        Row(

            modifier = Modifier
                .padding(12.dp)
        ) {

            Column(
                modifier = Modifier
                    .weight(1F)
                    .padding(12.dp)
            ) {
                Text(text = explore.title)
                Text(
                    text = explore.description,
                    style = MaterialTheme.typography.h6.copy(fontWeight = FontWeight.Light)
                )
            }
            Image(
                painter = painterResource(id = explore.drawable),
                contentDescription = null
            )
        }
    }

}