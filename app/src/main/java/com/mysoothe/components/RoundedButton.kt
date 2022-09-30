package com.mysoothe.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp

@Composable
fun RoundedButton(
    onclick: () -> Unit,
    paddingValues: PaddingValues,
    buttonText: String,
    height: Dp,
    backgroundColor: Color
) {
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .padding(paddingValues)
            .height(height),
        onClick = onclick,
        shape = MaterialTheme.shapes.medium,
        colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor)
    ) {
        Text(
            text = buttonText,
            style = MaterialTheme.typography.button,
            color = MaterialTheme.colors.onPrimary,
        )
    }
}