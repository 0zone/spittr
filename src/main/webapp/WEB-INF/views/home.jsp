<%--
  Created by IntelliJ IDEA.
  User: jinyu
  Date: 2018/8/26
  Time: 上午10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
    <head>
        <title>spittr</title>
        <link rel="stylesheet"
              type="text/css"
              href="<c:url value="/resources/style.css" />" >
    </head>

    <body>
    <h1>Welcome to Spitter</h1>

    <a href="<c:url value="/spittles" />">Spittles</a> |
    <a href="<c:url value="/spitter/register" />">Register</a>
    </body>
</html>
