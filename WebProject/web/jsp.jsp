<%--
  Created by IntelliJ IDEA.
  User: 19833
  Date: 2021/11/26
  Time: 11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        window.onload = function (){
            var codeImg = document.getElementById("codeImg");
            codeImg.onclick = function (){
                this.src="/WebProject/check?"+new Date().getTime();
            }
        }
    </script>
</head>
<body>
    <form action="/WebProject/sess4" method="post">
        用户名：<input type="text" name="username"><br>
        密码名：<input type="password" name="pwd"><br>
        <img id="codeImg" src="/WebProject/check"><br>
        验证码：<input type="text" name="checkCode"><br>
        <input type="submit" value="登录">
    </form>
    <div>
        <%=
            request.getAttribute("code_error") == null?"":request.getAttribute("code_error")
        %>
    </div>
    <div>
        <%=
        request.getAttribute("login_error") == null?"":request.getAttribute("login_error")
        %>
    </div>
</body>
</html>
