package com.microalgo.algoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class AlgoServiceApplication {

	public static Logger logger=Logger.getLogger("AlgoService");
	public static void main(String[] args) {

		SpringApplication.run(AlgoServiceApplication.class, args);
		logger.info("Algo Service Started");
		logger.info("Develop branch setup");
	}

}
