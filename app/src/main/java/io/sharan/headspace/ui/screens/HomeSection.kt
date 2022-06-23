package io.sharan.headspace.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun HomeSection(
    title: String,
    modifier: Modifier,
    content: @Composable () -> Unit
) {
    Column(modifier) {
        Text(
            text = title,
            style = MaterialTheme.typography.h4,
            modifier = Modifier
                .padding(start = 8.dp)
                .paddingFromBaseline(top = 40.dp, bottom = 8.dp)
        )
        content()
    }
}