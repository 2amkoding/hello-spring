package org.launchcode.hellospring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    //Handles request at PATH /hello
    @GetMapping("hello")
    @ResponseBody
    public String hello() {
        return "Hello, Spring!";
    }

    @GetMapping("goodbye")
    @ResponseBody
    public String goodbye() {
        return "Peace, Spring!";
    }

    //Handles DYNAMIC rqsts of the form /song?name=BBLDRIZZY
    //Passes @RequesetParam as an argument of controller method
    @GetMapping("song")
    @ResponseBody
    public String helloWQueryParam(@RequestParam String name){
        return "Hello, " + name + " !";
    }

    //Hanldes rqsts of the form using PATH: /hello/LaunchCode
    @GetMapping("hello/{name}")
    @ResponseBody
    public String helloWPathParam(@PathVariable String name) {
        return "Hello, " + name + "!";
    }
    
}
