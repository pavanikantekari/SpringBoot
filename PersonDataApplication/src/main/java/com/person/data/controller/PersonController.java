package com.person.data.controller;

//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

//import com.person.data.domain.Person;
//import com.person.data.service.PersonService;

//@RestController
//@RequestMapping("/persons")
//public class PersonController {
//	@Autowired
//	private PersonService service;
//	
//	@PostMapping("/addPersons")
//	private Iterable<Person>createPersons(@RequestBody List<Person> personList) {
//		Iterable<Person> list = service.savePersonData(personList);
//		return list;
//	}
//	@GetMapping("/person/{lastName}")
//	private List<Person>findByLastName(@PathVariable("lastName") String lastName) {
//		List<Person> personList = service.findByLastName("lastName");
//		return personList;
//	}
//	@GetMapping("/person/{firstName}/{lastName}")
//	private List<Person>findByFirstNameOrLastName(@PathVariable("firstName") String firstName,@PathVariable("lastName") String lastName) {
//		List<Person> personList = service.findByFirstNameOrLastName("firstName","lastName");
//		return personList;
//	}
//	
//
//}
