package com.al2.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/demo")
public class DemoController {
    @GetMapping(path = "message")
    public ResponseEntity<String> getDemoMessage() {
        return ResponseEntity.ok("Hello World");
    }
}
