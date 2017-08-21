package com.cylee.testspring;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * Created by cylee on 2017/8/22.
 */
public class TestJdbcTemplate {

    private DriverManagerDataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    public void setDataSource(DriverManagerDataSource dataSource) {
        this.dataSource = dataSource;
        jdbcTemplateObject = new JdbcTemplate(dataSource);
    }


    public void create(String name, int age) {
        String SQL = "insert into test (name, age) values (?, ?)";
        jdbcTemplateObject.update( SQL, name, age);
        System.out.println("Created Record Name = " + name + " Age = " + age);
        return;
    }

    public Person getStudent(Integer id) {
        String SQL = "select * from test where id = ?";
        Person student = jdbcTemplateObject.queryForObject(SQL,
                new Object[]{id}, new PersonMapper());

        return student;
    }
}
