<%--
  Created by IntelliJ IDEA.
  User: jinyu
  Date: 2018/8/26
  Time: 上午11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
    <head>
        <title>spitter</title>
        <link rel="stylesheet" type="text/css"
              href="<c:url value="/resources/style.css" />" >
    </head>
    <body>
        <h1>Register</h1>

        <form method="post">
            First Name: <input type="text" name="firstName" /><br/>
            Last Name: <input type="text" name="lastName" /><br/>
            Email: <input type="email" name="email" /><br/>
            Username: <input type="text" name="username" /><br/>
            Password: <input type="password" name="password" /><br/>
            <input type="submit" value="regsiter">
        </form>


    </body>
</html>
