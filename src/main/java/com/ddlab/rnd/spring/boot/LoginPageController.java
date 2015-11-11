package com.ddlab.rnd.spring.boot;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginPageController {
	
	@RequestMapping("/login")
	public String login() {
		 return "login";
	}

}
