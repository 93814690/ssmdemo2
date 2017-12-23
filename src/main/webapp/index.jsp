<%--
  Created by IntelliJ IDEA.
  User: 123
  Date: 2017/12/22/
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8"  %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="${pageContext.request.contextPath}/login.do" method="post">
    用户名:<input type="text" name="username" ><br>
    密码:<input type="password" name="password"><br>
    <input type="submit" value="登录">
  </form>
  <hr/>
  <a href="${pageContext.request.contextPath}/showAll.do">查看全部</a>
  <hr/>
  <form action="${pageContext.request.contextPath}/adduser.do" method="post">
    用户名:<input type="text" name="username" ><br>
    密码:<input type="password" name="password"><br>

    <input type="submit" value="添加用户">
  </form>
  </body>
</html>
