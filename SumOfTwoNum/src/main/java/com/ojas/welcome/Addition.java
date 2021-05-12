package com.ojas.welcome;

import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.apache.juli.logging.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Addition {
    Logger logger = Logger.getLogger(this.getClass());
	@GetMapping("/add/{num1}/{num2}")
String sumOfTwo(@PathVariable int num1 , @PathVariable int num2) {
		logger.info(" Sum = " + (num1 + num2));
		logger.debug(" date = " + new java.util.Date());
	return "SUM = " + (num1 + num2);
}
}
