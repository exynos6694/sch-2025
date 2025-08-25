package com.sch.springboot.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello")
    public String hello(Model model){
        // hello.html view에게 데이터 전달
        model.addAttribute("msg", "홍길동");
        return "hello"; // view name
    }

    @GetMapping("/spring-mvc")
    public String spring(Model model){
        // spring-mvc.html view에게 데이터 전달
        model.addAttribute("msg", "홍길동");
        return "spring-mvc"; // view name
    }
}