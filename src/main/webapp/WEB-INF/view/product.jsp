<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ProductDetails</title>
</head>
<body>
<table>
<tr>
<td>${product.getProduct_id()}</td>
<td>${product.getProduct_name()}</td>
<td>${product.getUnit_price()}</td>
<td>${product.getAvailable_quantity()}</td>
</tr>
</table>
</body>
</html>