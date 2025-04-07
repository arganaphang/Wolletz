package com.github.arganaphang.wolletz

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform