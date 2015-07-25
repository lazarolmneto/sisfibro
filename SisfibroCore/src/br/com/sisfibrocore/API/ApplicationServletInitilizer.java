package br.com.sisfibrocore.API;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

public class ApplicationServletInitilizer extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
		
		return application.sources(SisfibroApi.class);
	}
	
}
