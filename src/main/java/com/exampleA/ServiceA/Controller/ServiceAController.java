package com.exampleA.ServiceA.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/servicea")
public class ServiceAController {
    @GetMapping("/data")
    public ResponseEntity<String>getData(){
        return ResponseEntity.ok("Data from Service A");
    }
}
