package com.zeki.pressd

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform