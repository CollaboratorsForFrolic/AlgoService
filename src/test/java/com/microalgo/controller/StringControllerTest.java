package com.microalgo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringControllerTest {
    StringController stringController;
    @Test
    void testpingStringController() {

        //Assemble
        stringController=new StringController();
        MockHttpServletRequest request = new MockHttpServletRequest();
        RequestContextHolder.setRequestAttributes(new ServletRequestAttributes(request));
        ResponseEntity<String> expectedPingResponse=new ResponseEntity<String>(HttpStatus.OK);
        //Assume
        //Nothing to assume or mock
        //Act
        String responseEntity = stringController.pingStringController();

        //Assert
        assertEquals(expectedPingResponse.getStatusCode(),HttpStatus.OK);
    }
}