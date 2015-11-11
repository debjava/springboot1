package com.ddlab.rnd.spring.boot;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexPageController {

	@RequestMapping("/")
	public ModelAndView index() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("message", "A warm welcome to you.");
		return new ModelAndView("index", map);
	}

}
