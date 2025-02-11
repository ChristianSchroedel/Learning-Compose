package de.schroedel.learning.compose.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import de.schroedel.learning.compose.ui.theme.LearningComposeTheme

@Composable
fun BasicScreen(modifier: Modifier = Modifier) {
    val text = LoremIpsum().values.joinToString()
    // TODO #1: Add a Text element.

    // TODO #2: Load text from a string resource.

    // TODO #3: Add image and load content from a drawable resource.

    // TODO #4: Display text and image vertically alongside each other.

    // TODO #5: Center the text underneath the image.

    // TODO #6: Use a Modifier to apply this styling on the image element:
    //  a) size (220 dp)
    //  b) padding (6 dp each side)
    //  c) rounded corners (individual corner radius of 10 dp)
}

@Preview(showBackground = true)
@Composable
private fun BasicScreenPreview() {
    LearningComposeTheme {
        BasicScreen()
    }
}
