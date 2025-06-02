package com.example.app.backend

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController {

    @GetMapping("/hello")
    fun sayHello(): String {
        return "Hello, Sanghee9"
    }
}