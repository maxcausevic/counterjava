<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Counter</title>
</head>
<body>
<h1>You have visited <a href="">http://your_server</a> <c:out value = "${sessionScope.count}"/></h1>
<h2><a href="/">Test another Visit?</a></h2>
</body>
</html>