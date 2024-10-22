package com.nanshan.springbootmvctest.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/")
public class HelloController {

    @RequestMapping(path = "/hello1", method = RequestMethod.GET)
    public String helloWorld(HttpServletRequest req) {
        System.out.println("~~ hello1 ~~~");
        req.setAttribute("message", "Hello SpringBoot JSP! (使用 HttpServletRequest");
        return "hello";
    }

    @RequestMapping(path = "/hello2", method = RequestMethod.GET)
    public String helloWorld(@RequestParam Map<String, String> params, org.springframework.ui.Model model) {
        System.out.println("~~ hello2 ~~~");
        System.out.println(params.get("empName")); // 前端送來的 queryString
        model.addAttribute("message", "Hello SpringBoot JSP! (使用 Model)");
        return "hello";
    }

    @RequestMapping(path = "/hello3", method = RequestMethod.GET)
    public ModelAndView helloWorld() {
        System.out.println("~~ hello3 ~~~");
        return new ModelAndView(
                "hello",
                Map.of("message", "Hello SpringBoot JSP! (使用 ModelAndView)")
        );
    }
}
