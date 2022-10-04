package com.mysoothe.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.mysoothe.R
import com.mysoothe.components.RoundedButton

@Composable
fun WelcomeScreen() {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
        BackgroundImage()
        Column(
            modifier = Modifier.fillMaxWidth(),
            Arrangement.Center,
            Alignment.CenterHorizontally
        ) {
            Logo()
            Buttons()
        }
    }
}

@Composable
private fun Buttons() {
    RoundedButton(
        onclick = { /*TODO*/ },
        paddingValues = PaddingValues(start = 16.dp, end = 16.dp, top = 32.dp),
        buttonText = "SIGN UP",
        height = 72.dp,
        backgroundColor = MaterialTheme.colors.primary
    )
    RoundedButton(
        onclick = { /*TODO*/ },
        paddingValues = PaddingValues(start = 16.dp, end = 16.dp, top = 8.dp),
        buttonText = "LOG IN",
        height = 72.dp,
        backgroundColor = MaterialTheme.colors.secondary
    )
}

@Composable
private fun BackgroundImage() {
    Box {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = if (isSystemInDarkTheme()) R.drawable.ic_dark_welcome else R.drawable.ic_light_welcome),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
    }
}

@Composable
private fun Logo() {
    Box {
        Image(
            painter = painterResource(id = if (isSystemInDarkTheme()) R.drawable.ic_dark_logo else R.drawable.ic_light_logo),
            contentDescription = null
        )
    }
}