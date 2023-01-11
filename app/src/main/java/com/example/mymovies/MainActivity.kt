package com.example.mymovies

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
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
     Greeting("Android")
    }
   }
  }
 }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
 Text(text = "Hello $name!", modifier = modifier)
}

@Preview(showSystemUi = true, name = "Android Greeting")
@Composable
fun DefaultPreview() {
 MyMoviesTheme {
  Column(
   modifier = Modifier.fillMaxSize(),
   verticalArrangement = Arrangement.SpaceAround,
   horizontalAlignment = Alignment.CenterHorizontally
  )
  {
   Greeting("Sleyther", modifier = Modifier
    .background(Color.LightGray)
    .weight(2f));
   Greeting("Juan", modifier = Modifier
    .background(Color.Yellow)
    .weight(1f));
//   Greeting("Android", modifier = Modifier.background(Color.Cyan));
  }
 }
}