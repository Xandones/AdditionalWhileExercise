package com.alexandrohlopes.whileadditionalexecise

fun main() {
    var humidity = "humid"
    var humidityLevel = 80

    while (humidity == "humid") {
        humidityLevel -= 5
        if (humidityLevel <= 60)
            humidity = "it's comfy now"
        println("$humidityLevel : $humidity")

    }
}