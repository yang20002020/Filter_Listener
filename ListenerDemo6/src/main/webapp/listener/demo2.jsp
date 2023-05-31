<%--
  Created by IntelliJ IDEA.
  User: 26286
  Date: 2023/5/31
  Time: 20:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    session.setAttribute("name","aaa");//添加属性
    session.setAttribute("name","bbb");//属性替换
    session.removeAttribute("name"); //属性移除
%>
</body>
</html>
