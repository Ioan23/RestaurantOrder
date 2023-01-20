package com.xaivison.restaurantorder.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


@Composable
fun FloatingButtonView(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
) {
    FloatingActionButton(
        shape = RoundedCornerShape(30.dp),
        backgroundColor = purple,
        onClick = onClick)
    {
        Icon(Icons.Filled.ShoppingCart, "")
    }
}