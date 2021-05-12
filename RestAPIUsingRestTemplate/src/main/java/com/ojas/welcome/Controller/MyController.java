package com.ojas.welcome.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myapi")
public class MyController {
@GetMapping("/wish")
public String sayHello() {
	return "welcome";
}
}
