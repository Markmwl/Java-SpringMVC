<%--
  Created by IntelliJ IDEA.
  User: Mark
  Date: 2022-12-08
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>testScope</title>
</head>
<body>
<h2>testScope</h2>
<hr>
${requestScope.get("name")}
${requestScope.get("age")}
${requestScope.get("org.springframework.web.servlet.HandlerMapping.bestMatchingPattern")}
<hr>
${sessionScope.get("sessionname")}
${sessionScope.get("sessionage")}
</body>
</html>
