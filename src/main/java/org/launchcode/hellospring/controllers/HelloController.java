package org.launchcode.hellospring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping(value="bbldrizzy")
public class HelloController {

    //Handles request at PATH /hello
    @GetMapping("hello")
    public String hello() {
        return "Hello, Spring!";
    }

    //with RequestMapping ABOVE the class, method now lives /bbldrizzy/goodbye
    @GetMapping("goodbye")
    public String goodbye() {
        return "Peace, Spring!";
    }

    //Handles DYNAMIC rqsts of the form /song?name=BBLDRIZZY
    //Passes @RequesetParam as an argument of controller method
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value="hello")
    public String helloWQueryParam(@RequestParam String name){
        return "Hello, " + name + " !";
    }

    //Hanldes rqsts of the form using PATH: /hello/LaunchCode
    @GetMapping("{name}")
    public String helloWPathParam(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("form")
    public String helloForm(){
        return "<html>" +
                "<body>" +
                "<form action='hello' method='post'>" + //tells submit a rqst to /song
                "<input type='text' name='name'>" +
                "<input type='submit' value='Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}
