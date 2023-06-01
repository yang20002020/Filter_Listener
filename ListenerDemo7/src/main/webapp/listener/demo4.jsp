<%@ page import="listener.bean.Bean2" %><%--
  Created by IntelliJ IDEA.
  User: 26286
  Date: 2023/5/31
  Time: 23:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
     <%
         Bean2 bean2=new Bean2();
         bean2.setName("bean2");
         session.setAttribute("bean2",bean2); //如果session 序列化了，bean2也跟着序列化
     %>
</body>
</html>
