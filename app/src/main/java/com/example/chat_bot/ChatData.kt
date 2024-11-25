package com.example.chat_bot

data class ChatData (
    val message : String,
    val role : String
    )

enum class ChatRoleEnum(val role : String){
    USER("user"),
    MODEL("model")
}