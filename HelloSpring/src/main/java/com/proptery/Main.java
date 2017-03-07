package com.proptery;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Created by Administrator on 2017/1/25 0025.
 */
public class Main {
    public static void main(String[] args) throws SQLException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-property.xml");
        DataSource dataSource = (DataSource)ctx.getBean("dataSource");
        System.out.println(dataSource.getConnection());
    }
}
