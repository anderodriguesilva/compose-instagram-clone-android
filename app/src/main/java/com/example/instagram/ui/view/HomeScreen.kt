package com.example.instagram.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.instagram.data.Story
import com.example.instagram.ui.theme.spacingMedium

@Composable
fun HomeScreen (){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(MaterialTheme.colorScheme.background)) {

        InstagramToolBar()

        val stories = listOf(
            Story(userNickName = "Arsbrabo", userAvatar = "https://avatars.githubusercontent.com/u/138589175?v=4"),
            Story(userNickName = "Cristiano Ronaldo", userAvatar = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d7/Cristiano_Ronaldo_playing_for_Al_Nassr_FC_against_Persepolis%2C_September_2023_%28cropped%29.jpg/240px-Cristiano_Ronaldo_playing_for_Al_Nassr_FC_against_Persepolis%2C_September_2023_%28cropped%29.jpg"),
            Story(userNickName = "Messi", userAvatar = "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b4/Lionel-Messi-Argentina-2022-FIFA-World-Cup_%28cropped%29.jpg/220px-Lionel-Messi-Argentina-2022-FIFA-World-Cup_%28cropped%29.jpg"),
            Story(userNickName = "Cr7", userAvatar = "https://b.fssta.com/uploads/application/soccer/headshots/885.vresize.350.350.medium.14.png"),
            Story(userNickName = "diegolinks", userAvatar = "https://avatars.githubusercontent.com/u/36086232?v=4"),
            Story(userNickName = "janedoe", userAvatar = "https://i.redd.it/rmk3k21tcxu21.jpg"),
            Story(userNickName = "janedoe", userAvatar = "https://i.redd.it/rmk3k21tcxu21.jpg"),
            Story(userNickName = "janedoe", userAvatar = "https://i.redd.it/rmk3k21tcxu21.jpg"),
            Story(userNickName = "janedoe", userAvatar = "https://i.redd.it/rmk3k21tcxu21.jpg"),
            Story(userNickName = "janedoe", userAvatar = "https://i.redd.it/rmk3k21tcxu21.jpg"),
        )
        
        StoryList(stories = stories)
    }
}

@Composable
fun StoryList(stories: List<Story>) {
    LazyRow(modifier = Modifier.padding(top = spacingMedium)) {
        itemsIndexed(stories) { _, item ->
            StoryItem(story = item)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen()
}