package ru.raticate.FirstWebApplication;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {
    @GetMapping("/julia")
    String julia(){
        return "julia";
    }
    @GetMapping("/nikita")
    String nikita(){
        return "nikita";
    }
    @GetMapping("/hello_page")
    String helloPageShow(){
        return "hello_page";
    }
}
