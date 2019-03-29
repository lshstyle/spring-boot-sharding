package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.model.Log;

@Mapper
public interface LogMapper {

	List<Log> list();
}
