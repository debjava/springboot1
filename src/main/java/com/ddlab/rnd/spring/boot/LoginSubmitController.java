package com.ddlab.rnd.spring.boot;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginSubmitController {
	
	@RequestMapping(value="/loginSubmit", method=RequestMethod.POST)
	public ModelAndView loginSubmit(  @ModelAttribute ModelMap modelMap ) { //
		System.out.println(modelMap);
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", "Piku");
		return new ModelAndView("show", map);
		// return "index";
	}

}
