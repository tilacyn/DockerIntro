package ru.tilacyn.helloworld;

import static spark.Spark.*;

public class HelloWorld {
    public static void main(String[] args) {
        get("/hello", (req, res) -> "Hello World\n");
        get("/kek", (req, res) -> "wow\n\n\n");
    }
}