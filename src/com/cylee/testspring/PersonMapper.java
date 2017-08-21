package com.cylee.testspring;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by cylee on 2017/8/22.
 */
public class PersonMapper implements RowMapper<Person>{
    @Override
    public Person mapRow(ResultSet resultSet, int i) throws SQLException {
        Person person = new Person();
        person.name = resultSet.getString("name");
        person.age = resultSet.getInt("age");
        return person;
    }
}
