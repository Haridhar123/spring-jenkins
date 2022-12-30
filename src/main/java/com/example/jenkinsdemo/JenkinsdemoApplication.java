package com.example.jenkinsdemo;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsdemoApplication {
	public static Logger log=LoggerFactory.getLogger(JenkinsdemoApplication.class);

	@PostConstruct
	public void intt()
	{
		log.info("hi");
	}
	public static void main(String[] args) {
		log.info("bhbbhhb");
		SpringApplication.run(JenkinsdemoApplication.class, args);
		
	}

}
