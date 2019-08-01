package com.controller;

import com.entity.Employee;
import com.googlecode.objectify.ObjectifyService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;

import static com.googlecode.objectify.ObjectifyService.ofy;


public class EmployeeController extends HttpServlet {
    static {
        ObjectifyService.register(Employee.class);
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       req.getRequestDispatcher("/employee.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
          String fullName = req.getParameter("fullname");
          String birthDay = req.getParameter("birthday");
          String address = req.getParameter("address");
          String position = req.getParameter("position");
          String department = req.getParameter("department");
        long id = Calendar.getInstance().getTimeInMillis();
        // validate data

            HashMap<String, String> errors = new HashMap<>();
            if (fullName == null || fullName.isEmpty()) {
                errors.put("fullName", "Full Name is required!");
            }
            if (birthDay == null || birthDay.isEmpty()) {
                errors.put("birthDay", "Birth Day is required!");
            }
            if (address == null || address.isEmpty()) {
                errors.put("address", "Address is required!");
            }
            if (position == null || position.isEmpty()) {
                errors.put("position", "Position is required!");
            }if (department == null || department.isEmpty()) {
                errors.put("department", "Department is required!");
            }

        if (errors.size() == 0) {
            Employee employee = new Employee();
            employee.setId(id);
            employee.setFullName(fullName);
            employee.setBirthDay(birthDay);
            employee.setAddress(address);
            employee.setPosition(position);
            employee.setDepartment(department);
            ofy().save().entities(employee).now();

        }
        resp.sendRedirect("/list");


    }
}
