package com.mysoothe.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun UndTextField(
    value: String,
    onValueChange: (String) -> Unit,
    placeHolder: String,
    paddingValues: PaddingValues,
    leadingIcon: (@Composable () -> Unit)?
) {
    TextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(paddingValues)
            .height(56.dp),
        value = value,
        onValueChange = onValueChange,
        colors = TextFieldDefaults.textFieldColors(backgroundColor = MaterialTheme.colors.surface),
        leadingIcon = leadingIcon,
        shape = MaterialTheme.shapes.small,
        placeholder = {
            Row(
                modifier = Modifier.height(56.dp),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    text = placeHolder,
                    style = MaterialTheme.typography.body1,
                    color = MaterialTheme.colors.onSurface,
                )
            }
        },
    )
}