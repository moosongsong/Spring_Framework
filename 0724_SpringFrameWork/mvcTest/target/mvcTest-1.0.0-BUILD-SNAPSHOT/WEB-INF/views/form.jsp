<%--
  Created by IntelliJ IDEA.
  User: songe
  Date: 2020-07-24
  Time: 오후 3:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" >
    이름 : <input type="text" name="info.name"/><br/>
    전공 : <input type="text" name="info.major"/><br/>
    국어 점수 : <input type="text" name="jumsu[0]"/><br/>
    영어 점수 : <input type="text" name="jumsu[1]"/><br/>
    수학 점수 : <input type="text" name="jumsu[2]"/><br/>
    <button>등록</button>
</form>
</body>
</html>
