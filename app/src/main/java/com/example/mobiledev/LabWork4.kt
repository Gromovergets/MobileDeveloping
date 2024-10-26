package com.example.mobiledev


import android.inputmethodservice.Keyboard
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun SecondScreen() {

    Column(modifier = Modifier.fillMaxSize()) {


        Row(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Start),
            horizontalArrangement = Arrangement.Center
        ) {

            Text("Payphone", fontSize = 32.sp)
            Icon(
                imageVector = Icons.Default.Person,
                contentDescription = null,
                Modifier.size(44.dp)
            )
        }
        Row( Modifier.padding(10.dp)){
            Text( "Your chats", fontFamily = FontFamily.SansSerif, fontStyle = FontStyle.Italic, fontSize = 28.sp)
        }

            Row(Modifier.fillMaxWidth()){
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = null,
                    Modifier.size(54.dp)
                )
                Column {
                    Text("Chat member")
                    Text("Hello? How are you today?")
                }
            }
            Row(Modifier.fillMaxWidth()){
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = null,
                    Modifier.size(54.dp)
                )
                Column {
                    Text("Chat member")
                    Text("Hello? How are you today?")
                }
            }

        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(5.dp)
        ){

        }

        Spacer(modifier = Modifier.weight(1f))

        Row(
            modifier = Modifier
                .align(Alignment.End)
                .padding(16.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly

        )
        {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = null,
                Modifier.size(44.dp)
            )
            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = null,
                Modifier.size(44.dp)
            )
            Icon(
                imageVector = Icons.Default.Email,
                contentDescription = null,
                Modifier.size(44.dp)
            )
        }
    }


}


@Composable
@Preview
private fun preview() {
    SecondScreen()
}

