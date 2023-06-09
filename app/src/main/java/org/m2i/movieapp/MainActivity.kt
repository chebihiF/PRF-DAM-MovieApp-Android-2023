package org.m2i.movieapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import org.m2i.movieapp.ui.theme.MovieAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                MainContent()
            }
        }
    }
}

@Composable
fun MyApp(content: @Composable () -> Unit){
    MovieAppTheme {
        content()
    }
}

@Composable
fun MainContent(){
    Surface(color = MaterialTheme.colorScheme.background) {
        Text(text = "Hello World !!")
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MovieAppTheme {
        MainContent()
    }
}