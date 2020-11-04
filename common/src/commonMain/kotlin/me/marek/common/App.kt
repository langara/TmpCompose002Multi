package me.marek.common
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun App() {
    var text by remember { mutableStateOf("Hello, World!") }


    MaterialTheme {
        var x by remember { mutableStateOf(7) }
        Column(Modifier.padding(8.dp)) {
            Button(onClick = { text = "Hello, ${getPlatformName()}" }) { Text(text) }
            Button(onClick = { x += 1 }) { Text("++") }
            Text("aaa")
            Text("bbb $x")
            Example1()
//            Example2()
        }
    }

}

