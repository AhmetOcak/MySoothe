package com.mysoothe.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import com.mysoothe.R
import com.mysoothe.components.RoundedButton
import com.mysoothe.components.UndTextField

@Composable
fun LoginScreen() {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
        BackgroundImage()
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Header()
            LoginTextFields()
            LoginButton()
            SignUpText()
        }
    }
}

@Composable
private fun BackgroundImage() {
    Box {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = if (isSystemInDarkTheme()) R.drawable.ic_dark_login else R.drawable.ic_light_login),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
    }
}

@Composable
private fun Header() {
    Text(
        modifier = Modifier.paddingFromBaseline(top = 300.dp),
        text = "LOG IN",
        style = MaterialTheme.typography.h1,
        color = MaterialTheme.colors.onBackground,
    )
}

@Composable
private fun LoginTextFields() {
    UndTextField(
        value = "",
        onValueChange = {},
        placeHolder = "Email address",
        paddingValues = PaddingValues(top = 32.dp, start = 16.dp, end = 16.dp),
        null
    )
    UndTextField(
        value = "",
        onValueChange = {},
        placeHolder = "Password",
        paddingValues = PaddingValues(top = 8.dp, start = 16.dp, end = 16.dp),
        leadingIcon = null
    )
}

@Composable
private fun LoginButton() {
    RoundedButton(
        onclick = { /*TODO*/ },
        paddingValues = PaddingValues(top = 8.dp, start = 16.dp, end = 16.dp),
        buttonText = "LOG IN",
        height = 72.dp,
        backgroundColor = MaterialTheme.colors.primary
    )
}

@Composable
private fun SignUpText() {
    Row(modifier = Modifier.paddingFromBaseline(top = 32.dp)) {
        Text(
            text = "Don't have an account?",
            color = MaterialTheme.colors.onBackground,
            style = MaterialTheme.typography.body1,
        )
        Text(
            text = " Sign up",
            textDecoration = TextDecoration.Underline,
            color = MaterialTheme.colors.onBackground,
            style = MaterialTheme.typography.body1,
        )
    }
}