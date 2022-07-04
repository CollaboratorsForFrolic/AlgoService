package com.microalgo.integrationtests;

import com.microalgo.AlgoServiceApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = AlgoServiceApplication.class,
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class StringControllerIntegrationTest
{
    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testPingStringController()
    {
        //Assemble
        //Expected return status code is OK

        //act
        HttpStatus actualStatusCode=this.restTemplate
                        .getForEntity("http://localhost:" + port + "/stringping", ResponseEntity.class).getStatusCode();

        assertEquals(HttpStatus.OK,actualStatusCode);
    }
}
