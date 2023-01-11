package com.example.mymovies

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.mymovies.ui.theme.MyMoviesTheme

class MainActivity : ComponentActivity() {
 override fun onCreate(savedInstanceState: Bundle?) {
  super.onCreate(savedInstanceState)
  setContent {
   MyMoviesTheme {
    Surface(
     modifier = Modifier.fillMaxSize(),
     color = MaterialTheme.colors.background
    ) {
//     ButtonText();
//     MediaItem();
//     MediaList();
     /**
      * Manejo del estado
      */
//     val ( value, onValueChange ) = rememberSaveable { mutableStateOf("") };
//     StateSample(
//      value = value,
//      onValueChange = onValueChange);
//    }

     Scaffold(
      topBar = {
       TopAppBar(
        title = { Text(text = stringResource(id = R.string.app_name)) },
//        navigationIcon = {
//         IconButton(onClick = { /*TODO*/ }) {
//          Icon(imageVector = Icons.Default.Menu, contentDescription = null)
//         }
//        },
        actions = {
         IconButton(onClick = { /*TODO*/ }) {
          Icon(imageVector = Icons.Default.Search, contentDescription = null)
         }
         IconButton(onClick = { /*TODO*/ }) {
          Icon(imageVector = Icons.Default.Share, contentDescription = null)
         }
        }
       )
      }
     ) { padding ->
      MediaList(modifier = Modifier.padding(padding));
     }
    }
   }
  }
 }

 @Composable
 fun Greeting(name: String, modifier: Modifier = Modifier) {
  Text(
   text = "Hello $name!",
   modifier = modifier
  )
 }

 //@Preview(showSystemUi = true, device = Devices.PIXEL_4)
 @Composable
 fun StateSample(value: String, onValueChange: (String) -> Unit) {
  Column(
   modifier = Modifier
    .fillMaxSize()
    .padding(64.dp),
   verticalArrangement = Arrangement.Center,

   ) {
   TextField(
    value = value,
    onValueChange = { onValueChange(it) },
    modifier = Modifier.fillMaxWidth()
   )
   Text(
    text = value,
    modifier = Modifier
     .fillMaxWidth()
     .background(Color.Yellow)
     .padding(8.dp)
   )
   Button(
    onClick = { onValueChange("") },
    modifier = Modifier.fillMaxWidth(),
    enabled = value.isNotEmpty()
   ) {
    Text(text = "Clear")
   }
  }
 }

 @OptIn(ExperimentalFoundationApi::class)
//@Preview(showSystemUi = true)
 @Composable
 fun MediaList(modifier: Modifier = Modifier) {
  LazyVerticalGrid(
   contentPadding = PaddingValues(2.dp),
   cells = GridCells.Adaptive(200.dp),
   modifier = modifier,
   content = {
    items(getMedia()) { item ->
     MediaListItem(item, modifier = Modifier.padding(2.dp));
    }
   },

   )
 }

 //@Preview(showSystemUi = true)
 @Composable
 fun MediaListItem(item: MediaItem, modifier: Modifier = Modifier) {
  Column(
   modifier = modifier
  ) {
   Box(
    modifier = Modifier
     .height(200.dp)
     .fillMaxWidth(),
//   contentAlignment = Alignment.Center
   ) {
    AsyncImage(
     model = item.thumb,
     contentDescription = null,
     modifier = Modifier.fillMaxSize(),
     contentScale = ContentScale.Crop
    )
//   Image(
//    painter = rememberImagePainter(data = "https://picsum.photos/400/400", builder = {
//     crossfade(true)
//    }),
//    contentDescription = null,
//    modifier = Modifier.fillMaxSize(),
//    contentScale = ContentScale.Crop
//   );
    if (item.type == MediaItem.Type.VIDEO) {
     Icon(
      imageVector = Icons.Default.PlayCircleOutline,
      contentDescription = null,
      modifier = Modifier
       .size(92.dp)
       .align(Alignment.Center),
      tint = Color.White,
     )
    }
   }
   Box(
    modifier = Modifier
     .fillMaxWidth()
     .background(MaterialTheme.colors.secondary)
     .padding(16.dp),
    contentAlignment = Alignment.Center
   ) {
    Text(
     text = item.title,
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
}
