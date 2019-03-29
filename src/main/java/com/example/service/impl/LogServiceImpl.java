package com.example.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.LogMapper;
import com.example.model.Log;
import com.example.service.LogService;

@Service
public class LogServiceImpl  implements LogService{

	@Autowired
	private LogMapper logMapper;
	
	@Override
	public Map<String, Object> list() {
		// TODO Auto-generated method stub
		Map<String, Object> resultMap = new HashMap<String, Object>();
		List<Log> list = logMapper.list();
		resultMap.put("num", list == null ? 0: list.size());
		resultMap.put("list", list);
		return resultMap;
	}

}
