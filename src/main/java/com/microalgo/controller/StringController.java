package com.microalgo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.microalgo.constants.AlgoServiceConstants.URIConstants.STRING_PING_END_POINT;

@RestController
public class StringController
{
    @GetMapping(STRING_PING_END_POINT)
    public String pingStringController()
    {
        ResponseEntity<String> pingResponse=new ResponseEntity<>(HttpStatus.OK);
        return "Response From Algo Service";
    }
}
