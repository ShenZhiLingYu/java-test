package com.fanxuan.dao;

import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


public class StuDaoTest extends TestCase {

    @Test
    public void queryAll() {

        // 加载Spring配置文件，获取Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // 从Spring容器中获取对象
        // bean-id与接口名一致，首字母为小写


        jdbcTemplate.execute("select * from student");

    }
}