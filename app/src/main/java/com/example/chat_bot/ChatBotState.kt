package com.example.chat_bot

sealed interface ChatBotViState{
    data object Ideal : ChatBotViState

    data object Loading : ChatBotViState

    data class Success (val ChatData: String) : ChatBotViState
    data class Error(val ChatError : String): ChatBotViState
}