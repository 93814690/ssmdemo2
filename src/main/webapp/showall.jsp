<%--
  Created by IntelliJ IDEA.
  User: 123
  Date: 2017/12/22/
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"  %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>all</title>
  </head>
  <body>

  <c:forEach items="${users}" var="user">
    uid:${user.uid}  username:${user.username}<br/>
  </c:forEach>
  </body>
</html>
