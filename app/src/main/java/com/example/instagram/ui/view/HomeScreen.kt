package com.example.instagram.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.instagram.data.model.Feed
import com.example.instagram.data.model.Story
import com.example.instagram.data.repository.stories
import com.example.instagram.ui.theme.DividerColor
import com.example.instagram.ui.theme.spacingMedium

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {

        InstagramToolBar()

        StoryList(stories = stories)

        Divider(color = DividerColor, thickness = 0.2.dp)

        FeedItem(
            feed = Feed(
                userNickName = "MatheusPereira96",
                localName = "Belo Horizonte - MG",
                userAvatar = "https://folhadesabara.com.br/images/noticias/27656/fafa88c435afa8f302264c1ff59d4b6c.jpeg",
                imageUrl = "https://s2-ge.glbimg.com/US9QSi_8InxulU6qdlZS0RZIjoI=/0x0:1600x1200/1000x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_bc8228b6673f488aa253bbcb03c80ec5/internal_photos/bs/2023/x/p/J6Wz6BQRqijGQB0r027g/whatsapp-image-2023-07-24-at-15.30.39.jpeg",
                description = "Cheguei no maior de minas galera! #FechadoComOCruzeiro",
                postedAgo = "Há 21 horas"
            )
        )
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
fun HomeScreenPreview() {
    HomeScreen()
}