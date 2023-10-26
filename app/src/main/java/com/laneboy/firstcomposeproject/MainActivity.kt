package com.laneboy.firstcomposeproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.lifecycle.ViewModelProvider
import com.laneboy.firstcomposeproject.ui.theme.FirstComposeProjectTheme
import com.laneboy.firstcomposeproject.ui.InstagramProfileCard

class MainActivity : ComponentActivity() {

    private val viewModel by viewModels<MainViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Test(viewModel = viewModel)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun Test(viewModel: MainViewModel) {
    FirstComposeProjectTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    color = MaterialTheme.colorScheme.background
                )
        ) {
            val scrollState = rememberScrollState()
            LazyColumn {
                item {
                    TopAppBar(title = { Text(text = "TopAppBar") })
                }
                items(20) {
                    InstagramProfileCard(viewModel = viewModel)
                }
                item {
                    Icon(
                        Icons.Filled.AccountCircle,
                        contentDescription = null
                    )
                }
                items(20) {
                    InstagramProfileCard(viewModel = viewModel)
                }
            }
        }
    }

}


//    СОСТАВНОЙ ТЕКСТ

//@Preview(showBackground = true)
//@Composable
//fun TestText() {
//    Text(
//        buildAnnotatedString {
//            withStyle(SpanStyle(fontWeight = FontWeight.Bold)) {
//                append("Hello")
//            }
//            withStyle(SpanStyle(textDecoration = TextDecoration.Underline)) {
//                append(" ")
//            }
//            withStyle(SpanStyle(fontSize = 22.sp, textDecoration = TextDecoration.LineThrough)) {
//                append("World")
//            }
//        }
//    )
//}


