package com.gittest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.snnotation.*;

@RestController
@RequestMapping("/api/webhook")
public class WebhookController {
    @PostMapping
    public ResponseEntity<Spring> print(@RequestBody String requestBody){
        System.out.println("##### WEBHOOK #####" + requestBody);
        return new ResponseEntity<String>(requestBody, HttpStatus.OK);
    }
}
//jhfeuhrihef