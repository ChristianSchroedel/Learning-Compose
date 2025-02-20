package de.schroedel.learning.compose.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import de.schroedel.learning.compose.ui.theme.LearningComposeTheme

@Composable
fun BasicScreen(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(de.schroedel.learning.compose.R.drawable.profile_picture),
            contentDescription = "Profile Picture",
            modifier = Modifier
                .size(220.dp)
                .padding(6.dp)
                .clip(RoundedCornerShape(10.dp))
        )

        Text(text = stringResource(de.schroedel.learning.compose.R.string.learning_compose))

        Image(
            painter = painterResource(de.schroedel.learning.compose.R.drawable.like_share_subscribe),
            contentDescription = "like share subscribe banner",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .height(100.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun BasicScreenPreview() {
    LearningComposeTheme {
        BasicScreen()
    }
}
