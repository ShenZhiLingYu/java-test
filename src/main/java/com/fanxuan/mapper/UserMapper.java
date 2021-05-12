package com.fanxuan.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.tedu.mybatis.entity.User;

public interface UserMapper {

	Integer insert(User user);

	Integer deleteUserById(Integer id);

	Integer deleteUserByName(String username);

	Integer updatePassWord(String password);

	Integer deleteAll();

	List<User> findAll();

	User findUserById(Integer id);

	User findUserByUsername(String username);

	Integer getCount();

	Integer changePassword(@Param("id") Integer id, @Param("password") String password);

	Integer changeInfo( @Param("id")Integer id,
											@Param("username") String username,
											@Param("password") String password,
											@Param("age") Integer age,
											@Param("phone") String phone,
											@Param("email") String email);
	
	Integer deleteUserByIds(List<Integer> ids);
	Integer deleteUserByIdss(Integer[] ids);
	Integer deleteUserByIdsss(@Param("username")String username,@Param("ids")List<Integer> ids);
	Integer deleteUserByIdssss(@Param("username")String username,@Param("ids")Integer[] ids);
	
	
}
