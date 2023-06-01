<%@ page import="bean.Bean2" %>
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
