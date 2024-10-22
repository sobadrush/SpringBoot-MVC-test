package com.nanshan.springbootmvctest.controller;

import com.nanshan.springbootmvctest.model.Product;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.math.BigDecimal;
import java.util.List;
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

    @RequestMapping(path = "/hello4", method = RequestMethod.GET)
    public String helloWorld(@ModelAttribute Product productGG, Model model) {
        System.out.println("~~ hello4 ~~~");
        productGG.setId(7001L).setName("Apple Watch 13").setPrice(new BigDecimal("56.99"));
        System.out.println("Product : " + productGG);
        System.out.println("查看 model = " + model);
        return "hello";
    }

    @ModelAttribute("ProductList")
    public List<Product> getProductList() {
        System.err.println(" >>>>> @ModelAttribute(\"ProductList\") <<<<< ");
        return List.of(
            Product.builder().id(1001L).name("Apple Watch 1").price(new BigDecimal("56.99")).build(),
            Product.builder().id(1002L).name("Apple Pencil").price(new BigDecimal("23.87")).build(),
            Product.builder().id(1003L).name("iphone 21").price(new BigDecimal("58.23")).build()
        );
    }
}
