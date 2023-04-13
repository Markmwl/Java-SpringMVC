<%--
  Created by IntelliJ IDEA.
  User: Mark
  Date: 2022-12-05
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSPDemo1</title>
</head>
<body>
<h1>JSP,HELLO World!</h1>

<%
    System.out.println("hello,JSPDemo1!");
    int i =3;
%>

<%="%=看我打印的位置！"+ i%>

<%!
    String name ="张三";
    String GetName()
    {
        return  name;
    }
%>
</body>
</html>
