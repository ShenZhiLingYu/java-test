package com.fanxuan.dao;

import junit.framework.TestCase;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


public class StuDaoTest extends TestCase {

    @Test
    public void queryAll() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);

        jdbcTemplate.execute("select * from student");

    }
}