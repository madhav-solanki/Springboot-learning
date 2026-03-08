package com.example.Spring_Idea;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Repositry  extends JpaRepository<Student,Integer>{
               
	List<Student> FindByName(String name);
}
