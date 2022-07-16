package com.GitTuto.Gitdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitdemoApplication {
	static String countryName = "India";
	static int j= 10;
	static int i= 9;
	static String stateName = "AP";
	public static void main(String[] args) {
		SpringApplication.run(GitdemoApplication.class, args);
		System.out.println(countryName);
		System.out.println(stateName);
	}

}
