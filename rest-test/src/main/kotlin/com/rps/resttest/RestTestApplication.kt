package com.rps.resttest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RestTestApplication // Name could be improved =)

fun main(args: Array<String>) {
	runApplication<RestTestApplication>(*args)
}
