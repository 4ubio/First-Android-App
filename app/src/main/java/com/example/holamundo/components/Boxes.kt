package com.example.holamundo.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.holamundo.ui.theme.myCustomFont

@Preview(showBackground = true)
@Composable
fun TheBox(){
    Box(modifier = Modifier
        .height(300.dp)
        .width(300.dp)
        .verticalScroll(rememberScrollState())
        .background(Color(0xFF4F83B9))
    ){
        //Contenido
        Text(text = "Top Start", modifier = Modifier.align(Alignment.TopStart), fontFamily = myCustomFont, color = Color.White)
        Text(text = "Top Center", modifier = Modifier.align(Alignment.TopCenter), fontFamily = myCustomFont, color = Color.White)
        Text(text = "Top End", modifier = Modifier.align(Alignment.TopEnd), fontFamily = myCustomFont, color = Color.White)
        Text(text = "Center Start", modifier = Modifier.align(Alignment.CenterStart), fontFamily = myCustomFont, color = Color.White)
        Text(text = "Center Center", modifier = Modifier.align(Alignment.Center), fontFamily = myCustomFont, color = Color.White)
        Text(text = "Center End", modifier = Modifier.align(Alignment.CenterEnd), fontFamily = myCustomFont, color = Color.White)
        Text(text = "Bottom Start", modifier = Modifier.align(Alignment.BottomStart), fontFamily = myCustomFont, color = Color.White)
        Text(text = "Bottom Center", modifier = Modifier.align(Alignment.BottomCenter), fontFamily = myCustomFont, color = Color.White)
        Text(text = "Bottom End", modifier = Modifier.align(Alignment.BottomEnd), fontFamily = myCustomFont, color = Color.White)
    }
}

@Composable
fun theBoxFunc(name: String, modifier: Modifier, color: Color = Color.White){
    Text(
        text = name,
        modifier = modifier,
        color = color,
        fontFamily = myCustomFont
    )
}

@Preview(showBackground = true)
@Composable
fun TheBox2(){
    Box(modifier = Modifier
        .height(300.dp)
        .width(300.dp)
        .verticalScroll(rememberScrollState())
        .background(Color(0xFFFFFFFF))
    ){
        //Contenido
        theBoxFunc("Top Start", Modifier.align(Alignment.TopStart), Color.Blue)
        theBoxFunc("Top Center", Modifier.align(Alignment.TopCenter), Color.Cyan)
        theBoxFunc("Top End", Modifier.align(Alignment.TopEnd), Color.Yellow)
        theBoxFunc("Center Start", Modifier.align(Alignment.CenterStart), Color.Red)
        theBoxFunc("Center Center", Modifier.align(Alignment.Center), Color.Magenta)
        theBoxFunc("Center End", Modifier.align(Alignment.CenterEnd), Color.Black)
        theBoxFunc("Bottom Start", Modifier.align(Alignment.BottomStart), Color.Green)
        theBoxFunc("Bottom Center", Modifier.align(Alignment.BottomCenter), Color.Gray)
        theBoxFunc("Bottom End", Modifier.align(Alignment.BottomEnd), Color.DarkGray)
    }
}