package com.application.geminichat.data

import android.graphics.Bitmap

/**
 * @author Truong Vu
 */
data class Chat (
    val prompt: String,
    val bitmap: Bitmap?,
    val isFromUser: Boolean
)