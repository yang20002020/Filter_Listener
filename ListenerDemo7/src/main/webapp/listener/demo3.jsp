<%@ page import="listener.bean.Bean1" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <%
      Bean1 bean1=new Bean1();
      bean1.setName("张三");
      //属性添加 是任何类型都可以添加 ，但是绑定 绑定的类型必须数java类对象
      session.setAttribute("bean1",bean1); //绑定
      session.removeAttribute("bean1");  //解除绑定
  %>
</body>
</html>
