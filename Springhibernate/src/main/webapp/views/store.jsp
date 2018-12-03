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
    <%--<c:set var="products" value="${products}" scope="session"/>--%>

    <c:url var="addProduct" value="/add"/>
    <title></title>
</head>
<body>
<h1>${store.storeName}</h1>

<%--<c:if test="${empty products}">--%>
    <%--<h1>empty</h1>--%>
<%--</c:if>--%>
<%--<c:if test="${empty store.products}">--%>
    <%--<h1>empty in store</h1>--%>
<%--</c:if>--%>
<table border="1">
    <tr>
        <th> product code</th>
        <th> product name</th>
        <th> product price</th>
        <th> branch</th>
    </tr>
    <%--<c:forEach items="${products}" var="product">--%>
        <%--<tr>--%>
            <%--<td>${product.productCode}</td>--%>
            <%--<td>${product.productName}</td>--%>
            <%--<td>${product.productPrice}</td>--%>
        <%--</tr>--%>
    <%--</c:forEach>--%>
</table>
<h1><a href="${addProduct}">Add Product</a></h1>

</body>
</html>
