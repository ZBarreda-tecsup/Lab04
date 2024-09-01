package com.example.moviecontrol

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyScreen()
        }
    }
}

@Composable
fun MyScreen() {
    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        Text(text = "LazyColumn Example")
        MyLazyColumn()

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "LazyRow Example")
        MyLazyRow()

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Icon Example")
        MyIcon()
    }
}

@Composable
fun MyLazyColumn() {
    LazyColumn {
        items(10) { index ->
            Text(text = "objeto #$index", modifier = Modifier.padding(8.dp))
        }
    }
}

@Composable
fun MyLazyRow() {
    LazyRow {
        items(5) { index ->
            Text(text = "Item #$index", modifier = Modifier.padding(8.dp))
        }
    }
}

@Composable
fun MyIcon() {
    Icon(
        imageVector = Icons.Filled.Favorite, // Icono de teléfono
        contentDescription = "Phone Icon",
        tint = Color.Red,
        modifier = Modifier.size(30.dp)
    )
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyScreen()
}
