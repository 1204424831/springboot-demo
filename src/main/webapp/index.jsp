<%--
  Created by IntelliJ IDEA.
  User: yefengze
  Date: 2018/12/7
  Time: 19:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
ok
<c:forEach items="${sessionScope.list}" var="user">
    ${user.name}+++++++${user.age}+++${user.birthday}
</c:forEach>
</body>
</html>
