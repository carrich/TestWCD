<%--
  Created by IntelliJ IDEA.
  User: ducphu
  Date: 2019-08-01
  Time: 10:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Employee</title>
</head>
<body>
<div class="container">
    <div class="row mb-5">
        <h1 class="col-12">Add special content </h1>
        <div class="col-12">Add content director to your site.</div>
    </div>
    <div >
        <form action="/create" method="post">
            <div class="form-group">
                <lable>Full Name</lable>
                <input type="text" name="fullname" class="form-group">
            </div>
            <div class="form-group">
                <lable>Birthday</lable>
                <input type="text" name="birthday" class="form-group">
            </div>
            <div class="form-group">
                <lable>Address</lable>
                <input type="text" name="address" class="form-group">
            </div>
            <div class="form-group">
                <lable>Position</lable>
                <input type="text" name="position" class="form-group">
            </div>
            <div class="form-group">
                <lable>Department</lable>
                <input type="text" name="department" class="form-group">
            </div>
            <div class="form-group">
                <input type="submit" value="Submit" />
                <input type="reset" value="Reset" />

            </div>


        </form>

    </div>
</div>
</body>
</html>
