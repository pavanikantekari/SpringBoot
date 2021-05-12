package com.ojas.welcome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestApiUsingRestTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApiUsingRestTemplateApplication.class, args);
		@Override
	public void run(String...args) throws Exception {
			HttpHeaders headers = new HttpHeaders();
			RestTemplate re = new RestTemplate();
			String url = "http://localhost:8080/myapi/wish";
			HttpEntity<String>hn=new HttpEntity<String>(headers);
			ResponseEntity<String>res=re.exchange(url, HttpMethod.GET,hn,String.class);
			System.out.println(res.getBody());
		}
	}

}
