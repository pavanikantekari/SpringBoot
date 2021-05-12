package com.myapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

	@Controller
	public class HomeController {
		
		@RequestMapping(value="hi",method=RequestMethod.GET)
		@ResponseBody
		public String home(String name,HttpServletRequest req) {
			req.setAttribute("mName",name);
			return "Home";
		}
	}


