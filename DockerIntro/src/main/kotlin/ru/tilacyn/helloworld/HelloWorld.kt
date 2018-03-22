package ru.tilacyn.helloworld

import spark.kotlin.*

fun main(args: Array<String>) {
    val http: Http = ignite()

    http.get("/hello") {
        "OK"
    }
}