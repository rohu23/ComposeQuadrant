package com.rtee.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rtee.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeQuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Quadrants()
                }
            }
        }
    }
}


@Composable
fun Quadrants(){
    Column(modifier = Modifier.fillMaxWidth()) {
        Row(modifier = Modifier.weight(1f)){
            ComposeQuadrant(
                head = "Text composable" ,
                body = "Displays text and follows the recommended Material Design guidelines.",
                bgcolor = Color(0xFFF6EDFF),
                modifier = Modifier
                    .weight(1f)
            )
            ComposeQuadrant(
                head = "Image composable",
                body ="Creates a composable that lays out and draws a given Painter class object.",
                bgcolor = Color(0xFFD0BCFF),
                modifier = Modifier
                    .weight(1f)

            )
        }
        Row(Modifier.weight(1f)) {
            ComposeQuadrant(
                head = "Row composable" ,
                body = "A layout composable that places its children in a horizontal sequence.",
                bgcolor = Color(0xFFB69DF8),
                modifier = Modifier
                    .weight(1f)
            )
            ComposeQuadrant(
                head = "Column composable",
                body ="A layout composable that places its children in a vertical sequence.",
                bgcolor = Color(0xFFF6EDFF),
                modifier = Modifier
                    .weight(1f)

            )
        }
    }
}
@Composable
fun ComposeQuadrant(head: String, body: String, bgcolor: Color, modifier: Modifier = Modifier) {
    Column (
        modifier = modifier
            .fillMaxSize()
            .background(bgcolor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Text(
            text = head,
            modifier = Modifier
                .padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold

        )
        Text(
            text = body,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeQuadrantTheme {
        Quadrants()
    }
}