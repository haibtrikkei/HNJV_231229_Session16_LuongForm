<%--
  Created by IntelliJ IDEA.
  User: bthai
  Date: 5/14/2024
  Time: 8:53 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>View Student</h1>
    <table>
        <tr>
            <td>Student Id:</td>
            <td>${s.stuId}</td>
        </tr>
        <tr>
            <td>Full Name:</td>
            <td>${s.fullName}</td>
        </tr>
        <tr>
            <td>Gender:</td>
            <td>${s.gender?"Male":"Female"}</td>
        </tr>
        <tr>
            <td>Birthday:</td>
            <td>${s.birthday}</td>
        </tr>
        <tr>
            <td>Address:</td>
            <td>${s.address}</td>
        </tr>
        <tr>
            <td>Class Name:</td>
            <td>${s.className}</td>
        </tr>
    </table>
    <a href="initInsertStudent">Back</a>
</body>
</html>
