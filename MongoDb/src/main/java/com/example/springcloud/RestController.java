package com.example.springcloud;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	@Autowired
	MongoDbRepository repository;
	@GetMapping("/save")
	public String saveData()
	{
		Users user=new Users("Pandey","Berhampur");
		repository.save(user);
		return "Saved Successfully";
	}
	
	@GetMapping("/getAll")
	public ArrayList<Users> findAll()
	{
		return (ArrayList<Users>) repository.findAll();
	}

}
