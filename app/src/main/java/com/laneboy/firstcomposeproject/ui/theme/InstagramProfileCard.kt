package com.laneboy.firstcomposeproject.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.laneboy.firstcomposeproject.R

@Composable
fun InstagramProfileCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        shape = RoundedCornerShape(
            topStart = 4.dp,
            topEnd = 4.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.background,
        ),
        border = BorderStroke(
            width = 1.dp,
            color = MaterialTheme.colorScheme.onBackground
        ),
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    modifier = Modifier
                        .size(70.dp)
                        .clip(shape = CircleShape)
                        .background(Color.White)
                        .padding(2.dp),
                    painter = painterResource(id = R.drawable.ic_instagram_logo),
                    contentDescription = null,
                    contentScale = ContentScale.Crop
                )
                UserStatistics("Posts", "6,590")
                UserStatistics("Followers", "463M")
                UserStatistics("Following", "76")
            }
            UserDescription()
        }
    }
}

@Composable
private fun UserStatistics(
    title: String,
    value: String
) {
    Column(
        modifier = Modifier
            .height(80.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = value,
            fontSize = 28.sp,
            fontFamily = FontFamily.Cursive
        )
        Text(
            text = title,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
private fun UserDescription() {
    Column(
        modifier = Modifier
    ) {
        Text(
            modifier = Modifier
                .fillMaxWidth(),
            text = "Instargam",
            fontSize = 32.sp,
            fontFamily = FontFamily.Cursive
        )
        Text(
            modifier = Modifier
                .fillMaxWidth(),
            text = "#YoursToMake",
            fontSize = 14.sp
        )
        Text(
            modifier = Modifier
                .fillMaxWidth(),
            text = "www.facebook.com/emot",
            fontSize = 14.sp
        )
        Button(modifier = Modifier
            .width(120.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.tertiary,
                contentColor = MaterialTheme.colorScheme.background
            ),
            onClick = {}) {
            Text(text = "Follow", fontSize = 14.sp, fontWeight = FontWeight.SemiBold)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewCardLight() {
    FirstComposeProjectTheme(darkTheme = false) {
        InstagramProfileCard()
    }
}

@Preview
@Composable
private fun PreviewCardDark() {
    FirstComposeProjectTheme(darkTheme = true) {
        InstagramProfileCard()
    }
}