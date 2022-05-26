package com.adri.bs5;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Aplicacion {

	public static void main(String[] args) {
		SpringApplication.run(Aplicacion.class, args);
		log.error("Error message");
		log.warn("Warning message");
		log.info("Info message");
		log.debug("Debug message");
		log.trace("Trace message");
	}

}
