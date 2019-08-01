<%@ page import="java.util.List" %>
<%@ page import="com.entity.Employee" %><%--
  Created by IntelliJ IDEA.
  User: ducphu
  Date: 2019-08-01
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List</title>
</head>
<body>
<%
    List<Employee> list = (List<Employee>) request.getAttribute("list");
    for (Employee employee:
         list) {

        %>

<li>
    <%=employee.getFullName() + " | " + employee.getAddress() + " | " + employee.getBirthDay() + " | " + employee.getPosition() + " | " + employee.getDepartment()%>
</li>

<%
    }

%>
</body>
</html>
