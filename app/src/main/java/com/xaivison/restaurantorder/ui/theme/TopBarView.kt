package com.xaivison.restaurantorder.ui.theme


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.AppBarDefaults
import androidx.compose.material.ContentAlpha
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp


@Composable
fun TopBar(
    modifier: Modifier = Modifier,
    title: String,
    textColor: Color = Color.White,
//    align: TextAlign,
    backgroundColor: Color = Color.Magenta,
    elevation: Dp = AppBarDefaults.TopAppBarElevation,
    iconVector: ImageVector? = null,
    onBackClick: (() -> Unit) = {},
) {
    TopAppBar(
        modifier = modifier,
        backgroundColor = backgroundColor,
        elevation = elevation
    ) {
        CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.high) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 6.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                iconVector?.let {
                    IconButton(
                        onClick = onBackClick,
                        modifier = Modifier,
                    ) {
                        Icon(
                            imageVector = iconVector,
                            contentDescription = "Back"
                        )
                    }
                }

                Text(
                    text = title,
                    color = textColor,
                    style = MaterialTheme.typography.h6,
                    modifier = Modifier.align(Alignment.CenterVertically)
                        .weight(1f)
                        .padding(start = 9.dp),
                )
            }
        }
    }
}


@Preview
@Composable
fun TopBarPreview() {
    TopBar(title = "Top Bar", onBackClick = {})
}
