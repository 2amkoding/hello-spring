package org.launchcode.hellospring.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST},value="song")
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
    @ResponseBody
    public String helloForm(){
        return "<html>" +
                "<body>" +
                "<form action='song' method='post'>" + //tells submit a rqst to /song
                "<input type='text' name='name'>" +
                "<input type='submit' value='Greet me!'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }

}
