package com.scp.mvn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Controller
public class LoginControlller {
	
	
	@PostMapping("/login")
	public ModelAndView login(@RequestParam("usn") String un, @RequestParam("pws") String ps) {
		
		ModelAndView mv = new ModelAndView();
		
		System.out.println(un);
		System.out.println(ps);
		mv.setViewName("display");
		return mv;
		
		
	}
	
}
