<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Gena
  Date: 03.11.2020
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Error</title>
    <link href="<c:url value="/style/style.css" />" rel="stylesheet">
</head>
<body>
<div class="error">Error:${message}</div>
<a class="button" href="/student">To list of students</a>
</body>
</html>
