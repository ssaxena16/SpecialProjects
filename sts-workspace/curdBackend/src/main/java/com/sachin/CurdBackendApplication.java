package com.sachin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sachin.entities.User;
import com.sachin.repositories.UserRepository;

@SpringBootApplication
public class CurdBackendApplication implements CommandLineRunner{
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(CurdBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		userRepository.save(new User("sachin" ,"saxena"));
		userRepository.save(new User("harshit" ,"gupta"));
		userRepository.save(new User("himanshu" ,"bhargava"));
		
	}
}
