package com.xaivison.restaurantorder.ui.theme

import android.media.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import java.util.Date

@Composable
fun HomeCard(
    modifier: Modifier,
//    image: Image,
//    date: Date,
    backgroundColor: Color = Color.LightGray,
    title: String,
    subtitle: String
) {
    Card(
        elevation = 2.dp,
        shape = RoundedCornerShape(2.dp),
        backgroundColor =backgroundColor,
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
        ) {
            Text(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                text = title,
                style = MaterialTheme.typography.h4
            )

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                text = subtitle,
                style = MaterialTheme.typography.h6
            )

//            Spacer(modifier = Modifier.height(8.dp))
//
//            Text(
//                modifier = Modifier,
//                text = subtitle,
//                maxLines = 2,
//                style = MaterialTheme.typography.body2,
//            )
}
}
}