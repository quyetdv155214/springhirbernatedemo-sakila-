<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Quyet
  Date: 3/12/2018
  Time: 13:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <c:set var="store" value="${store}" scope="session"/>

    <title>${store.storeName}</title>
</head>
<body>
    ${store.storeName}


</body>
</html>
