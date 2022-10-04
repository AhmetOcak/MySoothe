package com.mysoothe.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.mysoothe.R
import com.mysoothe.components.AlignComp
import com.mysoothe.components.CollectionCard
import com.mysoothe.components.DefaultTitle
import com.mysoothe.components.UndTextField
import com.mysoothe.data.SootheData

@Composable
fun HomeScreen() {
    Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
        Column(
            modifier = Modifier.fillMaxSize().statusBarsPadding(),
            horizontalAlignment = Alignment.Start
        ) {
            SearchField()
            FavoriteCollectionsSection()
            AlignYourBodySection()
            AlignYourMindSection()
        }
    }
}

@Composable
private fun SearchField() {
    UndTextField(
        value = "",
        onValueChange = {},
        placeHolder = "Search",
        paddingValues = PaddingValues(top = 32.dp, start = 16.dp, end = 16.dp),
        leadingIcon = {
            Icon(
                modifier = Modifier.size(16.dp),
                painter = painterResource(id = R.drawable.ic_baseline_search),
                contentDescription = null,
            )
        }
    )
}

@Composable
private fun FavoriteCollectionsSection() {
    FavoriteTitle()
    FavoriteList()
}

@Composable
private fun AlignYourBodySection() {
    AlignYourBodyTitle()
    AlignYourBodyList()
}

@Composable
private fun AlignYourMindSection() {
    AlignYourMindTitle()
    AlignYourMindList()
}

@Composable
private fun FavoriteTitle() {
    DefaultTitle(
        modifier = Modifier
            .paddingFromBaseline(top = 40.dp)
            .padding(start = 16.dp),
        text = "FAVORITE COLLECTIONS"
    )
}

@Composable
private fun FavoriteList() {
    LazyHorizontalGrid(
        modifier = Modifier
            .fillMaxWidth()
            .height(120.dp)
            .padding(top = 8.dp),
        rows = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(start = 16.dp, end = 16.dp),
    ) {
        items(SootheData.favoriteCollections) {
            CollectionCard(text = it.text, resourceId = it.imageId)
        }
    }
}

@Composable
private fun AlignYourBodyTitle() {
    DefaultTitle(
        modifier = Modifier.padding(top = 32.dp, start = 16.dp),
        text = "ALIGN YOUR BODY"
    )
}

@Composable
private fun AlignYourBodyList() {
    LazyHorizontalGrid(
        modifier = Modifier
            .padding(top = 8.dp)
            .fillMaxWidth()
            .height(112.dp),
        rows = GridCells.Fixed(1),
        contentPadding = PaddingValues(start = 16.dp, end = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(SootheData.alignYourBody) {
            AlignComp(text = it.text, imageId = it.imageId)
        }
    }
}

@Composable
private fun AlignYourMindTitle() {
    DefaultTitle(
        modifier = Modifier.padding(top = 32.dp, start = 16.dp),
        text = "ALIGN YOUR MIND"
    )
}

@Composable
private fun AlignYourMindList() {
    LazyHorizontalGrid(
        modifier = Modifier
            .padding(top = 8.dp)
            .fillMaxWidth()
            .height(112.dp),
        rows = GridCells.Fixed(1),
        contentPadding = PaddingValues(start = 16.dp, end = 16.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(SootheData.alignYourMind) {
            AlignComp(text = it.text, imageId = it.imageId)
        }
    }
}