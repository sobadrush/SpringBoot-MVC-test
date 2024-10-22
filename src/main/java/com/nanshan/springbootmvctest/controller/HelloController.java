package com.nanshan.springbootmvctest.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {

    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public String helloWorld(HttpServletRequest req) {
        System.out.println("~~ Hello world ~~~");
        req.setAttribute("message", "Hello SpringBoot JSP!");
        return "hello";
    }

}
