package com.example.test.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class IkController {
    @GetMapping("/ik")
    public @ResponseBody String getMethodName() {
        return "ik";
    }
    
}
