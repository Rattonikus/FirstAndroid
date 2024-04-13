package com.example.myapplication

import android.graphics.Paint.Align
import androidx.compose.ui.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment
import kotlin.random.Random

class MainActivity : ComponentActivity()
{
    var jonesin = "Hi"

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContent {
            colorClicker()
           // Greeting(name = "name")
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
    Box(Modifier.background(Color.Cyan))
    {
        Row{
            Text(text = "h")
            Icon(imageVector = Icons.Default.AccountCircle, contentDescription = null)
        }
    }

}

@Composable
fun colorClicker(modifier: Modifier = Modifier)
{
    var color by remember {
        mutableStateOf(Color.Cyan)
    }
    
    var number by remember {
        mutableStateOf(0)
    }

    Box(modifier = modifier
        .background(color)
        .fillMaxSize())
    {
        Column(modifier = modifier
            .fillMaxSize(),
               verticalArrangement = Arrangement.Center,
               horizontalAlignment = Alignment.CenterHorizontally)
        {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center)
            {
                Icon(imageVector = Icons.Default.CheckCircle, contentDescription = null)
                Text(text = "Click me!",
                     color = Color.White,
                     modifier = modifier
                         .clickable {
                             color = Color(
                                     Random.nextFloat(),
                                     Random.nextFloat(),
                                     Random.nextFloat()
                             )

                             number++
                         })
            }
            

                Text(text = number.toString(), color = Color.Red)

        }


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

