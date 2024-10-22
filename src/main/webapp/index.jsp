<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
    <head>
        <title>SpringBoot index.jsp</title>
    </head>
    <body>
        <h1>index.jsp</h1>

        <a href="<%= request.getContextPath() %>/hello1">to hello.jsp (使用 HttpServletRequest)</a>
        <br/>
        <a href="<%= request.getContextPath() %>/hello2?empName=RogerLo">to hello.jsp (使用 Model)</a>
        <br/>
        <a href="<%= request.getContextPath() %>/hello3">to hello.jsp (使用 ModelAndView)</a>
        <br/>
        <a href="<%= request.getContextPath() %>/hello4">to hello.jsp (使用 @ModelAttribute)</a>
        <br/>
    </body>
</html>
