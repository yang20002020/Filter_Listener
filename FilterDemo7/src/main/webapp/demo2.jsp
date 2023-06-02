
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h1>demo2.jsp</h1>
<%
    System.out.println("demo2.jsp执行了");
%>
  <!--转发到demo3.jsp-->
<jsp:forward page="demo3.jsp"></jsp:forward>
</body>
</html>
