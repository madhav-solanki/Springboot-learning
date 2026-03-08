package com.example.Spring_Idea;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Std_Controller {

	@Autowired
	Std_service stdserv;
	
	
	@GetMapping("/students/{name}")
	public List<Student> getStudentsByName(@PathVariable String name)
	{
		return stdserv.getStudentsByName(name);
	}
}
