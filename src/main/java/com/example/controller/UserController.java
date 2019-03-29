package com.example.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping(value="/list")
	public Map<String, Object> list() {
		return userService.list();
	}
	
	@GetMapping(value="/delete")
	public String delete(@RequestParam("id") String id) {
		return userService.delete(id);
	}
	
	@GetMapping(value="/update")
	public String update(@RequestParam("id") String id,
			             @RequestParam("name") String name) {
		return userService.update(id, name);
	}
	
	@GetMapping(value="/add")
	public String add(@RequestParam("name") String name,
			          @RequestParam("age") Integer age,
			          @RequestParam("index") String index) {
		return userService.add(name,age, index);
	}
}
