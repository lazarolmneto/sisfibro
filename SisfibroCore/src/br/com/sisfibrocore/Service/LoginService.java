package br.com.sisfibrocore.Service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LoginService {

	@RequestMapping(name="/login",method=RequestMethod.GET)
	public boolean autentication(){
		return true;
	}
}
