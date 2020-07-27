<%--
  Created by IntelliJ IDEA.
  User: songe
  Date: 2020-07-24
  Time: 오후 5:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<div style="color: red">
    ${errorMessage}
</div>
<form method="post">
    <table>
        <thead>
        <td colspan="2">회원가입</td>
        </thead>
        <tbody>
        <tr>
            <td>닉네임</td>
            <td><input type="text" name="nick" value="${info.nick}"></td>
        </tr>
        <tr>
            <td>이메일</td>
            <td><input type="text" name="email" value="${info.email}"></td>
        </tr>
        <tr>
            <td>비밀번호</td>
            <td><input type="password" name="pass" value="${info.pass}"></td>
        </tr>
        <tr>
            <td>비밀번호</td>
            <td><input type="password" name="passConfirm" value="${info.passConfig}"></td>
        </tr>
        <tr>
            <td colspan="2"><button >등록하기</button></td>
        </tr>
        </tbody>
    </table>
</form>
</body>
</html>
