package com.person.data;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.person.data.domain.Person;
import com.person.data.service.PersonService;

@SpringBootApplication
public class PersonDataAppApplication implements CommandLineRunner {
	@Autowired
	private PersonService service;

	public static void main(String[] args) {
		SpringApplication.run(PersonDataAppApplication.class, args);
	}

	public void findByLastName() {
		List<Person> personList = service.findByLastName("kumar");
		for (Person person : personList) {
			System.out.println(person.toString());
		}
	}

	public void createPerson() {
		List<Person> personList = Arrays.asList(new Person(10, "ram", "raj", "Ra@Gmail", 20));
		Iterable<Person> list = service.savePersonData(personList);
		for (Person person : list) {
			System.out.println("person object" + person.toString());
		}
	}

	@Override
	public void run(String... args) throws Exception {
		createPerson();
	}
}
