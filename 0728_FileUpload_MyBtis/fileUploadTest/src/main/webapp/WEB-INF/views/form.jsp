<%--
  Created by IntelliJ IDEA.
  User: songe
  Date: 2020-07-28
  Time: 오후 4:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <title>form</title>
    <script src="js/jquery-3.5.1.min.js"></script>
<%--    <script type="text/javascript" src="http:code.jquery.com/jquery-1.8.3.min.js"></script>--%>
    <script>
        $(document).ready(function () {
            $('#btnUpload').click(function () {
                alert("파일을 업로드합니다.");
                var form = $('#uploadForm')[0];
                var formData = new FormData(form);
                $.ajax({
                    url:'upload',
                    type:'POST',
                    data:formData,
                    processData:false,
                    contentType: false,
                    dataType:'text',
                    success: function (data) {
                        console.log(data);
                    }
                });
            });
        });
    </script>
</head>
<body>
<form id="uploadForm" method="post" enctype="multipart/form-data">
    업로드 파일 <input type="file" id="upfile" name="upfile" multiple><br/>
    <button type="button" id="btnUpload">업로드하기</button>
</form>
</body>
</html>
