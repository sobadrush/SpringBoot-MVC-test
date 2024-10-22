<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
    <head>
        <title>SpringBoot index.jsp</title>
    </head>
    <body>
        <h1>index.jsp</h1>

        <a href="<%= request.getContextPath() %>/hello">to hello.jsp</a>
    </body>
</html>
