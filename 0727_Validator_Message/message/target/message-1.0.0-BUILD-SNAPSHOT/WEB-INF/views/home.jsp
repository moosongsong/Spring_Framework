<%@ page language="java" %>
<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page session="false" pageEncoding="UTF-8" %>
<html>
<head>
	<title>Home</title>
	<meta charset="UTF-8">
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<spring:message code="title"/>
<hr>
<spring:message code="label.email"/> : <input type="text"/>
<hr>
<spring:message code="label.nick"/>
<hr>
<button><spring:message code="label.send"/></button>
</body>
</html>
