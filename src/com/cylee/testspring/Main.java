package com.cylee.testspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by cylee on 2017/8/21.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestJdbcTemplate testJdbcTemplate =
                (TestJdbcTemplate) context.getBean("testJDBCTemplate");
//        System.out.println("------Records Creation--------" );
//        testJdbcTemplate.create("Zara", 11);
//        testJdbcTemplate.create("Nuha", 2);
//        testJdbcTemplate.create("Ayan", 15);

          Person p = testJdbcTemplate.getStudent(1);
          System.out.println("name:"+p.name+" age:"+p.age);
    }
}
