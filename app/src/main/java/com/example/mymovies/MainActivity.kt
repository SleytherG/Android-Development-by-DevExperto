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
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
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
 Text(
  text = "Hello $name!",
  modifier = modifier)
}

@Preview(showSystemUi = true)
@Composable
fun MediaItem() {
 Column() {
  Box(
   modifier = Modifier
    .height(200.dp)
    .fillMaxWidth()
    .background(color = Color.Red)
  ) {

  }
  Box(
   modifier = Modifier
    .fillMaxWidth()
    .background(MaterialTheme.colors.secondary)
    .padding(16.dp),
   contentAlignment = Alignment.Center
  ) {
   Text(
    text = "Title 1",
    style = MaterialTheme.typography.h6
   )

  }
 }
}

//@Preview(showSystemUi = true)
@Composable
fun ButtonText() {
 Box(
  modifier = Modifier.fillMaxSize(),
  contentAlignment = Alignment.Center
 ) {
  Text(
   text = "Hello World",
   maxLines = 1,
   softWrap = false,
   overflow = TextOverflow.Ellipsis,
   style = MaterialTheme.typography.h4.copy(
    shadow = Shadow(
     offset = Offset(5f, 5f),
     blurRadius = 5f,
     color = Color.Black.copy(alpha = 0.5f)
    )
   )
  )
 }
}
