package com.example.webdistribue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WebdistribueApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebdistribueApplication.class, args);
	}
	@Autowired
	private CandidatRepository candidatRepository;
	@Bean
	ApplicationRunner init(){
		return (args )->{
			candidatRepository.save(new Candidat("Hadir", "maaroufi", "@esprit.tn"));
			candidatRepository.save(new Candidat("badr", "amir", "@gmail.tn"));
			candidatRepository.save(new Candidat("iyed", "raja", "@YAHOO.tn"));
			candidatRepository.findAll().forEach(System.out::println);
		};
	}

}
