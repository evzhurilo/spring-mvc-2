package com.zhurylo.spring_mvc_2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/say_hello")
    public String sayHello() {
        return "hello_world";
    }


}
