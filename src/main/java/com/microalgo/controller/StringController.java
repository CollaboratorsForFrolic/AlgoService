package com.microalgo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController
{
    @GetMapping("/stringping")
    public ResponseEntity<String> pingStringController()
    {
        ResponseEntity<String> pingResponse=new ResponseEntity<String>(HttpStatus.OK);
        return pingResponse;
    }
}
