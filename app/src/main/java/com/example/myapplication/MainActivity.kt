package com.example.myapplication

import android.graphics.Paint.Align
import androidx.compose.ui.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Build
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

class MainActivity : ComponentActivity()
{
    var jonesin = "Hi"

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContent()
        {
            Greeting(name = "name")
        }
    }

    fun buttonThing()
    {
        jonesin = "Lmao"
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier)
{
    var joney = "text 1"
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center)
    {
        Text(text = "Hi")
        Icon(imageVector = Icons.Default.AccountCircle, contentDescription = null)
        testRow()

    }

}

@Composable
fun testRow()
{
    Row{
        Text(text = "h")
        Icon(imageVector = Icons.Default.AccountCircle, contentDescription = null)
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview()
{
    MyApplicationTheme {
        Greeting("Android")
    }
}

