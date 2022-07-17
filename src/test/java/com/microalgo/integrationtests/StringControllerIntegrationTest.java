package com.microalgo.integrationtests;

import com.microalgo.AlgoServiceApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import static com.microalgo.constants.AlgoServiceConstants.URIConstants.LOCAL_HOST;
import static com.microalgo.constants.AlgoServiceConstants.URIConstants.*;
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
                        .getForEntity(LOCAL_HOST+ port + STRING_PING_END_POINT, ResponseEntity.class).getStatusCode();

        assertEquals(HttpStatus.OK,actualStatusCode);
    }

    //Positive Case to check reversal operation
    @Test
    public void reverseAStringControllerTest()
    {
        //assume
        String input = "Random String 456 madam *  were";
        String expectedResponse = "erew  * madam 654 gnirtS modnaR";

        //Assemble

        URI uri = UriComponentsBuilder.fromHttpUrl(LOCAL_HOST + port).path(STRING_PING_END_POINT + REVERSE_A_STRING)
                .queryParam("input", input).build().toUri();

        //act
        ResponseEntity<String> actualResponse=this.restTemplate.getForEntity(uri, String.class);
        //assert
        assertEquals(expectedResponse,actualResponse.getBody());
    }
}
