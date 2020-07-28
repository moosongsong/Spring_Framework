<%--
  Created by IntelliJ IDEA.
  User: songe
  Date: 2020-07-27
  Time: 오후 7:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>list</title>
</head>
<body>
list
<table>
    <tbody>
    <c:forEach var="item" items="${boards}">
        <tr>
            <td><c:out value="${item.title}"></c:out></td>
            <td><c:out value="${item.email}"></c:out></td>
            <td><c:out value="${item.id}"></c:out> </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
