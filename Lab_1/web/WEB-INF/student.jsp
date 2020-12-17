<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Gena
  Date: 03.11.2020
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student</title>
    <link href="<c:url value="/style/style.css"/>" rel="stylesheet">
</head>
<body>
<table class="result">
    <caption>Submitted Student Information</caption>
    <tr>
        <td>ID</td>
        <td>${student.id}</td>
    </tr>
    <tr>
        <td>Name</td>
        <td>${student.name}</td>
    </tr>
    <tr>
        <td>Age</td>
        <td>${student.age}</td>
    </tr>
    <a class="button" href="/student">To list of students</a>
</table>
</body>
</html>
