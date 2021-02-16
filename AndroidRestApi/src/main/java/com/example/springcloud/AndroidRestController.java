package com.example.springcloud;

import java.awt.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springcloud.service.UserService;


@Controller
public class AndroidRestController {
	
	@Autowired
	private UserService service;
	@GetMapping(value = "/user")
	public java.util.List<User> getUser()
	{
		java.util.List<User> user=new ArrayList<>();
		user.add(new User(1,"Abhishek","7634934738"));
		user.add(new User(2,"Purnima","7004604875"));
		user.add(new User(3,"Kaushal","9801647125"));
		user.add(new User(4,"Abhishek","90909090"));
		return user;
		
	}
	@RequestMapping("/hello/{name}")
	public String getData(@PathVariable String name)
	{
		return "Hello "+name;
	}
	@GetMapping("/")
	public String viewHomePage(Model model)
	{
		model.addAttribute("user",service.getAllEmployees());
		
		/*java.util.List<User> user=new ArrayList<>();
		user.add(new User(1,"Abhishek","7634934738"));
		user.add(new User(2,"Purnima","7004604875"));
		user.add(new User(3,"Kaushal","9801647125"));
		user.add(new User(4,"Abhishek","90909090"));
		model.addAttribute("user",user);*/
		return "index";
	}
	@GetMapping("/home")
	public String getHomePage() {
		return"home";
	}

}
