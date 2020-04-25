<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
<div>
<a href="inventory/products">All Products</a><br/>
<form method="post" action="inventory/save">
	<pre>
product_id	<input type="text" name="product_id" id="product_id"/>
product_name	<input type="text" name="product_Name" id="product_Name"/>
unit_price	<input type="number" name="unit_price" id="unit_price"/>
available_quantity	<input type="number" name="available_quantity" id="available_quantity"/>
	<input type="submit" value="Save"/>	
	</pre>
</form>
<form method="post" action="inventory/delete">
<pre>
Product ID	<input type="text" name="product_id" id="product_id"/>
	<input type="submit" value="Save"/>	
	</pre>
</form>
	
</div>

</body>
</html>