package com.example.demo;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import lombok.extern.slf4j.Slf4j;

import java.util.Collections;
import java.util.Map;

@Slf4j
@Controller
public class HomeController {

    public HomeController() {
        log.info("I'm HomeController constructor");
    }

    @Get
    public Map<String, Object> hello() {
        return Collections.singletonMap("message", "Hello World");
    }
}
