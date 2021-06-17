package com.chambertran.chamberfood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChamberfoodApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ChamberfoodApplication.class, args);
		
		String pum = ControllerNumber1.chucrute();
		String chule = ControllerNumber2.gorgonzola();
		
		System.out.println("Chucrute " + pum + " e gorgonzola " + chule + "!");
		
	}

}
