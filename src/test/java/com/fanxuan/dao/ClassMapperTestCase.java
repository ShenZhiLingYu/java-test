package com.fanxuan.dao;

import com.fanxuan.mapper.ClassMapper;
import com.fanxuan.vo.ClazzVO;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ClassMapperTestCase {
	SqlSessionFactoryBean bean;
	MapperScannerConfigurer msc; // 扫描接口
	BasicDataSource s;

	private AbstractApplicationContext ac;
	private ClassMapper classMapper;

	@Before
	public void doBefore() {
		// 加载Spring配置文件，获取Spring容器
		ac = new ClassPathXmlApplicationContext("spring.xml");

		// 从Spring容器中获取对象
		// bean-id与接口名一致，首字母为小写
		classMapper = ac.getBean("classMapper", ClassMapper.class);
	}

	@After
	public void doAfter() {
		ac.close();
	}

	@Test
	public void getClassInfo() {
		String className = "jsd1807";
		ClazzVO clazzVO = classMapper.getClassInfo(className);
		System.out.println("【clazzVO】");
		System.out.println(clazzVO);
	}
	
}