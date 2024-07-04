package com.application.geminichat

import android.graphics.Bitmap
import com.application.geminichat.data.Chat

/**
 * @author Truong Vu
 */
data class ChatState (
    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt: String = "",
    val bitmap: Bitmap? = null
)