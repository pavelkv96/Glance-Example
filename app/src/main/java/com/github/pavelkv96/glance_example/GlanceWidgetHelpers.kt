package com.github.pavelkv96.glance_example

import android.os.Build
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.glance.GlanceModifier
import androidx.glance.appwidget.cornerRadius

@Composable
fun GlanceModifier.appWidgetBackgroundRadius(): GlanceModifier {
    return if (Build.VERSION.SDK_INT >= 31) {
        this.cornerRadius(android.R.dimen.system_app_widget_background_radius)
    } else {
        this.cornerRadius(16.dp)
    }
}