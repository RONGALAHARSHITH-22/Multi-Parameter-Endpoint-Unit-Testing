package com.example.ms1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionController {
    @GetMapping(value = "/ms1/add", produces = "text/plain")
    public String add(@RequestParam int a, @RequestParam int b) {
        return "MS 1.1 - Additon = " + (a + b);
    }
}
