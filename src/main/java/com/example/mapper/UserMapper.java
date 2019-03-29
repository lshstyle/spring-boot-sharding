package com.example.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.model.User;

@Mapper
public interface UserMapper {

	List<User> list();

	int delete(@Param("id") String id);

	int update(@Param("id") String id, @Param("name") String name);

	int add(@Param("name") String name, @Param("age") int age, @Param("index") String index);
}
