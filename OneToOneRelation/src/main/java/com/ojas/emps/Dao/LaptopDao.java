package com.ojas.emps.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ojas.emps.model.Laptop;

@Repository
public interface LaptopDao extends JpaRepository <Laptop,Integer>{

}
