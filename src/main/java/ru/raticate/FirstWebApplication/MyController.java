package ru.raticate.FirstWebApplication;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MyController {

    @GetMapping("/julia")
    String julia() {
        return "julia";
    }

    @GetMapping("/nikita")
    String nikita() {
        return "nikita";
    }

    @GetMapping("/")
    String helloPageShow() {
        return "hello_page";
    }

    String nikitaMood;

    @PostMapping("/nikita/message")
    String message(@RequestParam(value = "mood") String mood) {
        nikitaMood = mood;
        System.out.println(mood);
        return "redirect:/nikita/info";
    }

    @GetMapping("/nikita/info")
    String iUnderstandPage() {
        return "understand";
    }
}
