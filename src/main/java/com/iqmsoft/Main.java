package com.iqmsoft;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.iqmsoft.domain.Sample;
import com.iqmsoft.repository.SampleRepository;

@SpringBootApplication
public class Main implements CommandLineRunner{

	private static final Logger logger = LoggerFactory.getLogger(Main.class);
	
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
	
	@Autowired
	SampleRepository toDoRepository;
	
	@Override
	public void run(String... arg0) throws Exception {
		toDoRepository.save(new Sample("Test1", true, 10));
		toDoRepository.save(new Sample("Test2", false, 11));
		toDoRepository.save(new Sample("Test3", true, 12));
		toDoRepository.save(new Sample("Test4", false, 13));
		toDoRepository.save(new Sample("Test5", true, 14));
		toDoRepository.save(new Sample("Test6", true, 15));
		toDoRepository.save(new Sample("Test7", true, 17));
		toDoRepository.save(new Sample("Test8", true, 18));
		toDoRepository.save(new Sample("Test9", true, 19));
		toDoRepository.save(new Sample("Test10", true, 20));
		
		logger.info("Sample data saved");		
	}
}
