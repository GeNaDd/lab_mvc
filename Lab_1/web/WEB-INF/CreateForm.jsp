<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Gena
  Date: 03.11.2020
  Time: 15:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>AddStudent</title>
    <link href="<c:url value="/style/style.css"/>" rel="stylesheet">
</head>
<body>
<form method="POST" action="/add">
    <table>
        <caption>Student Information</caption>
        <tr>
            <td>ID</td>
            <td><input name="id" /></td>
        </tr>
        <tr>
            <td>Name</td>
            <td><input name="name" /></td>
        </tr>
        <tr>
            <td>Age</td>
            <td><input name="age" /></td>
        </tr>
    </table>
    <input class="button" type="submit" value="Submit">
</form>

</body>
</html>
