package com.fanxuan.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.fanxuan.entity.User;
import com.fanxuan.mapper.UserMapper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SimpleTestCase {
	SqlSessionFactoryBean bean;
	MapperScannerConfigurer msc; // 扫描接口
	BasicDataSource s;

	private AbstractApplicationContext ac;
	private UserMapper userMapper;

	@Before
	public void doBefore() {
		// 加载Spring配置文件，获取Spring容器
		ac = new ClassPathXmlApplicationContext("spring.xml");

		// 从Spring容器中获取对象
		// bean-id与接口名一致，首字母为小写
		userMapper = ac.getBean("userMapper", UserMapper.class);

	}

	@After
	public void doAfter() {
		ac.close();
	}

	@Test
	public void getConnection() throws SQLException {

		ac = new ClassPathXmlApplicationContext("spring.xml");

		BasicDataSource ds = ac.getBean("dataSource", BasicDataSource.class);

		Connection conn = ds.getConnection();
		System.out.println(conn);

	}

	@Test
	public void insert() {

		// 测试功能
		User user = new User();
		user.setUsername("coot");
		user.setPassword("12345");
		System.out.println("before:" + user);
		Integer rows = userMapper.insert(user);
		System.out.println("rows=" + rows);
		System.out.println("after:" + user);

	}

	@Test
	public void delete() {

		// 测试功能
		Integer id = 1;
		Integer rows = userMapper.deleteUserById(id);
		System.out.println("rows=" + rows);
	}

	@Test
	public void deleteUserByName() {
		// 测试功能
		String username = "soot";
		Integer rows = userMapper.deleteUserByName(username);
		System.out.println("rows=" + rows);
	}

	@Test
	public void updatePassWord() {

		// 测试功能
		String password = "666666";
		Integer rows = userMapper.updatePassWord(password);
		System.out.println("rows=" + rows);
	}

	@Test
	public void deleteAll() {
		// 测试功能
		Integer rows = userMapper.deleteAll();
		System.out.println("rows=" + rows);
	}

	// 线程的运行特征，宏观并行，微观串行
	@Test
	public void findAll() {
		List<User> users = userMapper.findAll();
		for (User user : users) {
			System.out.println(user);
		}
	}

	@Test
	public void findUserById() {
		Integer id = 8;
		User user = userMapper.findUserById(id);
		System.out.println(user);
	}

	@Test
	public void findUserByUsername() {
		User user = userMapper.findUserByUsername("koot");
		System.out.println(user);
	}

	@Test
	public void getCount() {
		Integer count = userMapper.getCount();
		System.out.println(count);
	}

	@Test
	public void changePassword() {

		// 测试功能
		Integer id = 8;
		String password = "888888";
		Integer rows = userMapper.changePassword(id, password);
		System.out.println("rows=" + rows);
	}
	
	@Test
	public void changeInfo() {

		// 测试功能
		Integer id = 8;
		String password = "959959599";
		String username = "danny";
		Integer age = 29;
		String phone = "6569865454";
		String email = "asda@163.com";
		Integer rows = userMapper.changeInfo(id, username, password, age, phone, email);
		System.out.println("rows=" + rows);
	}
	
	//List<Integer> 集合批量删除数据
	@Test
	public void deleteUserByIds() {
		List<Integer> ids = new ArrayList<Integer>();
		ids.add(13);
		Integer rows = userMapper.deleteUserByIds(ids);
		System.out.println("rows=" + rows);
	}
	
	//Integer[] 数组批量删除数据
	@Test
	public void deleteUserByIdss() {
		
		Integer[] ids = {17,19};
		Integer rows = userMapper.deleteUserByIdss(ids);
		System.out.println("rows=" + rows);
	}
	
	//用list<Integer> 双参数批量删除数据
	@Test
	public void deleteUserByIdsss() {
		
		List<Integer> ids = new ArrayList<Integer>();
		ids.add(11);
		ids.add(14);
		Integer rows = userMapper.deleteUserByIdsss(null,ids);
		System.out.println("rows=" + rows);
	}
	
	//Integer[] 双参数组批量删除数据(删除以下编号指定的usrename的用户)
		@Test
		public void deleteUserByIdssss() {
			
			Integer[] ids = {16,18};
			Integer rows = userMapper.deleteUserByIdssss("coot",ids);
			System.out.println("rows=" + rows);
		}
	
	

}
