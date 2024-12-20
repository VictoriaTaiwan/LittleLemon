package com.iries.littlelemon.presentation.common

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.bumptech.glide.Glide
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.iries.littlelemon.data.MenuEntity

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun MealCard(
    menuEntity: MenuEntity
) {
    val context = LocalContext.current
    val uri = menuEntity.image

    Row {
        Column(
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .padding(5.dp, 10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = menuEntity.title,
                textAlign = TextAlign.Center
            )
            Text(
                text = menuEntity.description,
                textAlign = TextAlign.Center
            )
            Text(
                text = "$ ${menuEntity.price}",
                textAlign = TextAlign.Center
            )
        }
        Spacer(modifier = Modifier.width(50.dp))

        GlideImage(
            model = uri,
            contentDescription = null,
            modifier = Modifier
                .size(150.dp, 150.dp),
            contentScale = ContentScale.Crop
        ) {
            it.thumbnail(Glide.with(context).asDrawable().load(uri))
        }

    }
}
