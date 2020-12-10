package com.rps.resttest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RestTestApplication

fun main(args: Array<String>) {
	println("Hello Kotlin!")
	runApplication<RestTestApplication>(*args)
}
