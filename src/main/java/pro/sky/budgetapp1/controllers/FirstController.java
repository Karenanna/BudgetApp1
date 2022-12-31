package pro.sky.budgetapp1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.AnnotatedArrayType;

@RestController
public class FirstController {
@GetMapping
    public String helloWorld() {
        return "Hello, Web!";
    }
@GetMapping("/path/to/page")
    public String page(@RequestParam String page) {
        return "Anna" + page;
    }
}
