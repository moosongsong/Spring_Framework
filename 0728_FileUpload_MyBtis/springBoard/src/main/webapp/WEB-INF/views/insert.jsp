<%--
  Created by IntelliJ IDEA.
  User: songe
  Date: 2020-07-27
  Time: 오후 4:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert</title>
</head>
<body>
insert page : ${errorMessage}
<form method="post">
    <table>
        <thead>
        <td colspan="2" style="text-align: center">글쓰기</td>
        </thead>
        <tbody>
        <tr>
            <td>email</td>
            <td><input type="text" name="email" value="${command.email}"></td>
        </tr>
        <tr>
            <td>title</td>
            <td><input type="text" name="title" value="${command.title}"></td>
        </tr>
        <tr>
            <td>content</td>
            <td><textarea name="content" rows="10" cols="25">${command.content}</textarea></td>
        </tr>
        <tr>
            <td colspan="2" style="align-content: center"><button>등록하기</button></td>
        </tr>
        </tbody>
    </table>
</form>

</body>
</html>
