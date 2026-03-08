package com.example.Spring_Idea;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Std_service {

	
	@Autowired
	Repositry repo;
	
	public List<Student> getStudentsByName(String name)
	{
		return repo.FindByName(name);
	}
}
