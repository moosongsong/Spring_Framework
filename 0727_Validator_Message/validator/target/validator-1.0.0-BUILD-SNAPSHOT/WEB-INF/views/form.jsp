<%--
  Created by IntelliJ IDEA.
  User: songe
  Date: 2020-07-27
  Time: 오전 9:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script src="/WEB-INF/js/jquery-3.5.1.min.js"></script>
</head>
<body>
<form:form modelAttribute="info">
    <label for="nick">
        nick : <form:input path="nick" type="text"/>
        <form:errors code="nick"/>
    </label>
    <hr>
    <label for="email">
        나이 : <form:input path="email" type="text"/>
        <form:errors code="email"/>
    </label>
    <hr>
    <label for="pass">
        나이 : <form:input path="pass" type="text"/>
        <form:errors code="pass"/>
    </label>
    <hr>
    <label for="passConfig">
        나이 : <form:input path="passConfig" type="text"/>
        <form:errors code="passConfig"/>
    </label>
    <form:errors code="passNotMatch"/>
    <button>insert</button>
</form:form>
</body>
</html>
