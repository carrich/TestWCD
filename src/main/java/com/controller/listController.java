package com.controller;

import com.entity.Employee;
import com.googlecode.objectify.ObjectifyService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import static com.googlecode.objectify.ObjectifyService.ofy;

public class listController extends HttpServlet {
    static {
        ObjectifyService.register(Employee.class);
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Employee> list = ofy().load().type(Employee.class).list();
        req.setAttribute("list",list);
        req.getRequestDispatcher("/list.jsp").forward(req,resp);
    }


}
