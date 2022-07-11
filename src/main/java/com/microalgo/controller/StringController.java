package com.microalgo.controller;

import com.microalgo.service.StringServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.microalgo.constants.AlgoServiceConstants.URIConstants.*;

@RestController
@RequestMapping(STRING_PING_END_POINT)
public class StringController
{
    @Autowired
    private StringServices stringServices;

    @GetMapping
    public ResponseEntity<String> pingStringController()
    {
        ResponseEntity<String> pingResponse=new ResponseEntity<>(HttpStatus.OK);
        return pingResponse;
    }

    @GetMapping(REVERSE_A_STRING)
    public ResponseEntity<String> reverseAString(@RequestParam String input)
    {

        return ResponseEntity.ok().body(stringServices.reverseString(input));

    }
}
