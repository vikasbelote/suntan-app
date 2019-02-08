package com.suntan.suntanapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SuntanAppApplication extends SpringBootServletInitializer  {
	
	private static Class applicationClass = SuntanAppApplication.class;

	public static void main(String[] args) {
		SpringApplication.run(SuntanAppApplication.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }

}

