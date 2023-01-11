package com.example.mymovies

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mymovies.ui.theme.MyMoviesTheme

class MainActivity : ComponentActivity() {
 override fun onCreate(savedInstanceState: Bundle?) {
  super.onCreate(savedInstanceState)
  setContent {
   MyMoviesTheme {
    // A surface container using the 'background' color from the theme
    Surface(
     modifier = Modifier.fillMaxSize(),
     color = MaterialTheme.colors.background
    ) {
     ButtonText();
    }
   }
  }
 }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
 Text(text = "Hello $name!", modifier = modifier)
}

//@Preview(showSystemUi = true)
@Composable
fun MediaItem() {
 Column() {
  Box(
   modifier = Modifier
    .height(200.dp)
    .fillMaxWidth()
    .background(color = Color.Red)
    .align(Alignment.CenterHorizontally)
  ) {

  }
  Text("Title 1")
 }
}

@Preview(showSystemUi = true)
@Composable
fun ButtonText() {
 Box(
  modifier = Modifier.fillMaxSize(),
  contentAlignment = Alignment.Center
 ) {
  Text(
   text = "Hello World",
   modifier = Modifier
    .clickable { /*TODO*/ }
    .background(Color.Cyan)
    .border(width = 2.dp, color = Color.Blue)
    .padding(horizontal = 16.dp, vertical = 8.dp)
  )
 }
}
