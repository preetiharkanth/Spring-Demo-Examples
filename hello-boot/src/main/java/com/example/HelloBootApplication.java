package com.example;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloBootApplication implements CommandLineRunner {
	  Logger logger = LoggerFactory.getLogger(HelloBootApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(HelloBootApplication.class, args);
	}
	
	@Autowired
	  
	  PersonService personService;

	@Override
	public void run(String... arg0) throws Exception {
		
	    Person person = new Person();
	    
	    person.setFirstName("FName");
	  
	    person.setLastName("LName");
	  
	    person.setAge(20);
	  
	    person.setPlace("Place");
	  
	 
	  
	    if ( personService.addPerson(person) > 0 ){
	  
	      logger.info("Person saved successfully");
	  
	    }
	  
	 
	  
	    for(Person p : personService.getAllPerson()){
	  
	      logger.info(p.toString());
	  
	    }
		
		
	}
}

