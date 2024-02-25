package com.example.onlineexamapp;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
@EntityScan("com")
public class OnlineexamappApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineexamappApplication.class, args);
		
        int len=new String("TKA").length();
		
		System.out.println("Length is " + len) ;
		
		
		List<Integer> list= Arrays.asList(1,2,3,4,5,6);
		
		list.stream().filter(number->number%2==0).forEach(System.out::println);
		
	}

}
