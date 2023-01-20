package com.xaivision.restaurantorder.view

import android.view.Menu
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.xaivison.restaurantorder.ui.theme.*

@Composable
fun RestaurantScreenView() {
    
    RestaurantOrderTheme() {

       Scaffold(
            modifier =Modifier.fillMaxSize(),
            topBar ={TopBar(title = "Restaurantul Hai la masa") },
floatingActionButton = {
FloatingButtonView() {
    
}
},
           isFloatingActionButtonDocked = true,
           floatingActionButtonPosition = FabPosition.End,
           content ={padding ->
                RestaurantContent(
                    modifier = Modifier
                        .background(Color.Transparent)
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState())
                        .padding(
                            top = 9.dp,
                            start = 9.dp,
                            end = 9.dp,
                            bottom = padding.calculateBottomPadding()
                        ),
                )

           }
       )
        
    }
}

@Composable
fun RestaurantContent(modifier: Modifier){
    val buttonClickedState = remember {
        mutableStateOf(false)
    }
Column() {

    HomeCard(modifier = modifier.padding(20.dp), title = "HaiLaMasa", subtitle ="Esti ceea ce mananci, mananca bine!" )
//    Menu()

    Divider()

//                BounceExample()
    Column(
        modifier = Modifier.height(300.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = {
                buttonClickedState.value = !buttonClickedState.value

            },

//        modifier = Modifier.bounceClick {  }
        ) {
            Text(

                "Menu",
                style = MaterialTheme.typography.button,
//                        modifier = Modifier.bounceClick {}
            )
        }

        if ((buttonClickedState.value)) {
            Menu()
        } else {
            Box() {

            }
        }

    }


}}
