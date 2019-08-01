package com.listener;

import com.entity.Employee;

import com.googlecode.objectify.ObjectifyService;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ObjectifyHelper implements ServletContextListener{
    public void contextInitialized(ServletContextEvent event) {
        ObjectifyService.register(Employee.class);

    }
}
