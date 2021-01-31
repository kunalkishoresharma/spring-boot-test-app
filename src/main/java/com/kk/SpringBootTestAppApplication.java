package com.kk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootTestAppApplication {
	private Map<String,Object> cache = new HashMap<String,Object>()
	private static final String REST_URL ="example.com/user";
	public static void main(String[] args) {
		SpringApplication.run(SpringBootTestAppApplication.class, args);
		int i = 10;
	}
	//Story id: 301
	public void loadDataCache(){
		//logic
	}
}
