package com.example.test.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TestController {
    @GetMapping("/")
    public @ResponseBody String main() {
        return "main";
    }
    @GetMapping("/test")
    public @ResponseBody String test() {
        return "test";
    }
    
}
