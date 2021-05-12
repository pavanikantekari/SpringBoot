package com.myapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController1 {
	@RequestMapping("myHome")
	public ModelAndView myHome() {
		ModelAndView mv=new ModelAndView();
		mv.addObject("wish","welcome");
		mv.setViewName("myhome");
		return mv;
	}
	@RequestMapping(value="myHome",method=RequestMethod.POST)
	public ModelAndView disp( @RequestParam("uname") String uname,
	@RequestParam("upass") String upass) {
		ModelAndView mv=new ModelAndView();
		
		if(uname.equalsIgnoreCase("java") && upass.equalsIgnoreCase("ojas")) {
			mv.addObject("st","valid user");
			
		}
		else {
			mv.addObject("st","Invalid user");
		}
		mv.setViewName("mypage");
		return mv;
	}

}
