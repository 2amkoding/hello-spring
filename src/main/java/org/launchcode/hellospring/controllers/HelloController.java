package org.launchcode.hellospring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller


public class HelloController {

    //Handles DYNAMIC rqsts of the form /hello?name=BBLDRIZZY
    //Passes @RequesetParam as an argument of controller method
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST},value = "hello")
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

    @GetMapping("form")
    public String helloForm(){
        return "form";
    }
}
