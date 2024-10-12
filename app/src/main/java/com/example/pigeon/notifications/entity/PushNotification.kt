package com.example.pigeon.notifications.entity

data class PushNotification(
    val data: NotificationData,
    val to: String
)