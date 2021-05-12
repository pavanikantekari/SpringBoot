package com.myapp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

public class HelloController {
	public class HomeController {
		@RequestMapping(value="home",method=RequestMethod.GET)
		public String home(String name,HttpServletRequest req) {
			req.setAttribute("mName",name);
			return "Home";
		}
	}

}
