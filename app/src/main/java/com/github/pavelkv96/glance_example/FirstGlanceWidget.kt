package com.github.pavelkv96.glance_example

import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.glance.Button
import androidx.glance.GlanceModifier
import androidx.glance.ImageProvider
import androidx.glance.action.actionStartActivity
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.GlanceAppWidgetReceiver
import androidx.glance.appwidget.appWidgetBackground
import androidx.glance.background
import androidx.glance.layout.Alignment
import androidx.glance.layout.Column
import androidx.glance.layout.Row
import androidx.glance.layout.fillMaxSize
import androidx.glance.layout.fillMaxWidth
import androidx.glance.layout.height
import androidx.glance.layout.padding
import androidx.glance.text.FontWeight
import androidx.glance.text.Text
import androidx.glance.text.TextStyle

/**
 * Simple widget for showcasing how a widget using Glace is constructed.
 */
class FirstGlanceWidget : GlanceAppWidget() {

    @Composable
    override fun Content() {
        Column(
            modifier = GlanceModifier
                .fillMaxSize()
                .background(ImageProvider(R.drawable.app_widget_background))
                .appWidgetBackground()
                .appWidgetBackgroundRadius()
                .padding(16.dp)
//                .padding(horizontal = 16.dp, vertical = 8.dp)
        ) {
            Text(
                text = "First Glance widget",
                modifier = GlanceModifier
                    .fillMaxWidth()
                    .padding(bottom = 8.dp),
                style = TextStyle(fontWeight = FontWeight.Bold),
            )
            Row(
                modifier = GlanceModifier.fillMaxSize(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(
                    text = "Button 1",
                    modifier = GlanceModifier.height(48.dp),
                    onClick = actionStartActivity<MainActivity>()
                )
                Button(
                    text = "Button 2",
                    modifier = GlanceModifier.height(48.dp),
                    onClick = actionStartActivity<MainActivity>()
                )
            }
        }
    }
}

class FirstGlanceWidgetReceiver : GlanceAppWidgetReceiver() {

    override val glanceAppWidget: GlanceAppWidget = FirstGlanceWidget()
}