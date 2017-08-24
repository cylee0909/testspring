package com.cylee.testspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by cylee on 2017/8/22.
 */
@Controller
public class TestController {
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(ModelMap model) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestJdbcTemplate testJdbcTemplate =
                (TestJdbcTemplate) context.getBean("testJDBCTemplate");
        Person p = testJdbcTemplate.getStudent(1);

        return "test";
    }
}
