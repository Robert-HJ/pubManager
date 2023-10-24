package com.toyProject.pubManager.api.test;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name ="TEST API")
public class TestController {

    @Schema
    @GetMapping("testAPI")
    public ResponseEntity<String> testAPI(){
        return new ResponseEntity<String>("Test API", HttpStatusCode.valueOf(200));

    }

}
