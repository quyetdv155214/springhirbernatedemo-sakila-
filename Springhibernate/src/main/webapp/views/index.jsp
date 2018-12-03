<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Quyet
  Date: 30/11/2018
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>

<c:url value="/store/" var="view"/>
<table border="1">
    <tr>
        <th>shop name</th>
        <th>shop address</th>
    </tr>
    <c:forEach items="${listStore}" var="store">
        <tr>
            <td>${store.storeName}</td>
            <td>
                <c:forEach items="${store.addresses}" var="address">
                    ${address.address}
                </c:forEach>
            </td>
            <td>
            	<a href="${view }/${store.storeId}">view</a>
            </td>
        </tr>
    </c:forEach>
</table>


</body>
</html>
