package com.example.moviecatalog.models

import android.app.Activity
import java.util.Date

data class DataPattern(
    var title: String,
    var type: String,
    var release: String,
    var image: Int,
    var link: Activity
)
