<%--
  Created by IntelliJ IDEA.
  User: songe
  Date: 2020-07-24
  Time: 오후 12:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!-- 합쳐지고 최소화된 최신 CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
    <!-- 부가적인 테마 -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
    <!-- 합쳐지고 최소화된 최신 자바스크립트 -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
    <title>register</title>
</head>
<body>
<form name="regForm" action="/register" method="post">
<table>
    <thead>
    <tr>
        <td colspan="2" style="text-align: center">회원가입</td>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>메일주소</td>
        <td><input type="text" name="email"/></td>
    </tr>
    <tr>
        <td>비밀번호</td>
        <td><input type="password" name="pass"/></td>
    </tr>
    <tr>
        <td>비밀번호확인</td>
        <td><input type="password" name="passConfirm"/></td>
    </tr>
    <tr>
        <td>회원이름</td>
        <td><input type="text" name="nick"/></td>
    </tr>
    <tr>
        <td colspan="2">
            <button class="btn btn-default" >등록하기</button>
        </td>
    </tr>
    </tbody>
</table>
</form>
</body>
</html>
