package com.toyProject.pubManager.api.test;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("testAPI")
    public ResponseEntity<String> testAPI(){
        return new ResponseEntity<String>("Test API", HttpStatusCode.valueOf(200));

    }

}
