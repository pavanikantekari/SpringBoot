package com.ojas.emps;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.ojas.emps.Dao.StudentDao;
import com.ojas.emps.model.Laptop;
import com.ojas.emps.model.Student;

@SpringBootApplication
public class OneToOneRelationInSpringApplication  {
	@Autowired
	private Laptop laptopDao;
	
	@Autowired
	private StudentDao studentDao;

	public static void main(String[] args) {
		SpringApplication.run(OneToOneRelationInSpringApplication.class, args);
		System.out.println("welcome");
	}
	
	private void saveData() {
		Laptop laptop1 = new Laptop(2, "Dell");
		laptopDao.save(laptop1);
		Student s = new Student(12, "sandhya", 34, laptop1);
		studentDao.save(s);
		System.out.println("inserted");
	}

	@Transactional
	private void showData() {
		// get All data
		List<Laptop> laptops = laptopDao.findAll();
		List<Student> students = studentDao.findAll();
		System.out.println("--------Student:----------");
		students.forEach(System.out::println);
		System.out.println("---------Laptop----------");
		laptops.forEach(System.out::println);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//
//	}

}
