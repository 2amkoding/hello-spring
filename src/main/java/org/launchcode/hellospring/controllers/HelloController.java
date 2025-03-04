package org.launchcode.hellospring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class HelloController {

    // Handles request at path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }

    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye() {
        return "Peace-out, Spring!";
    }

    //Handler Rqst of the form /hello?name=LaunchCode
    @GetMapping("hello")
    @ResponseBody
    public String helloWQueryParam(@RequestParam String name) {
        return "Hello, " + name + "!";
    }
}

