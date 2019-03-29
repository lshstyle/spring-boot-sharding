package com.example.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.UserMapper;
import com.example.model.User;
import com.example.service.UserService;

@Service
public class UserServiceImpl  implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public Map<String, Object> list() {
		Map<String,Object> resultMap = new HashMap<String, Object>();
		List<User> list = userMapper.list();
		resultMap.put("list", list);
		resultMap.put("num", list == null? 0:list.size());
		return resultMap;
	}
	
	public String delete(String id) {
		int  res = userMapper.delete(id);
		if (res == 0 ) {
			return "failed";
		} else {
			return "success";
		}
	}

	@Override
	public String update(String id, String name) {
		int res = userMapper.update(id, name);
		if (res == 0 ) {
			return "failed";
		} else {
			return "success";
		}
	}

	@Override
	public String add(String name, int age, String index) {
		int res = userMapper.add(name, age, index);
		if (res == 0 ) {
			return "failed";
		} else {
			return "success";
		}
	}
	

	
}
