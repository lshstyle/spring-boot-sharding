package com.example.service;

import java.util.Map;

public interface UserService {

	Map<String, Object> list();
	
	String delete(String id);
	
	String update(String id, String name);
	
	String add(String name, int age, String index);
}
