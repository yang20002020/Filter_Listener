
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
 <h1>登录页面</h1>
 <h3><font color="red">${msg}</font></h3>
 <!--pageContext.request.contextPath 工程名-->
<form action="${pageContext.request.contextPath}/UserServlet" method="post">
    <table border="1" width="400">
        <tr>
            <td>用户名</td>
            <td><input type="text" name="username"></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="text" name="password"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="登录"></td>
        </tr>
    </table>

</form>
</body>
</html>
