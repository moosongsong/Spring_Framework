<%--
  Created by IntelliJ IDEA.
  User: songe
  Date: 2020-07-27
  Time: 오후 3:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <meta charset="UTF-8">
</head>
<body>
<c:if test="${!empty loginInfo}">
    email : ${loginInfo.email}<br/>
    nick : ${loginInfo.nick}<br/>
    Register : ${loginInfo.registerAt}<br/>
</c:if>
</body>
</html>
