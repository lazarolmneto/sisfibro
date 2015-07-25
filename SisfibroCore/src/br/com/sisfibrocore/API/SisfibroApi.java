package br.com.sisfibrocore.API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableAutoConfiguration
@Configuration
@ComponentScan

public class SisfibroApi {

	@RequestMapping(name="/")
	String hello(){
		System.out.println("Nois");
		return "Hello world!";
	}
	
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(SisfibroApi.class);
		app.setShowBanner(false);
		app.run(args);
	}

}
