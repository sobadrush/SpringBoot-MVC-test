package com.nanshan.springbootmvctest.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HelloController {

    @RequestMapping("/hello")
    public String helloWorld(HttpServletRequest req) {
        System.out.println("~~ Hello world ~~~");
        req.setAttribute("message", "Hello SpringBoot JSP!");
        return "hello";
    }

}
