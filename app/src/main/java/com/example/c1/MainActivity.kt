package com.example.c1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.c1.ui.theme.C1Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            C1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingText("Happy Birthday! Alex", "From, Mob")
                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Row {
            Image(
                painter = painterResource(id = R.drawable.baseline_cake_24),
                contentDescription = "Happy Birthday",
                modifier = Modifier
                    .height(50.dp)
                    .width(50.dp),
                contentScale = ContentScale.Crop,

                )
            Text(
                text = message,
                fontSize = 100.sp,
                lineHeight = 116.sp,
                color = MaterialTheme.colorScheme.primary,
            )
        }
        Text(
            text = from,
            fontSize = 36.sp,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    C1Theme {
        GreetingText("Happy Birthday! Alex", "From, Mob")
    }
}