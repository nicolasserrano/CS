# Northbrick application

Install the northbrick application from the files in the folder: 
[https://github.com/nicolasserrano/CS/tree/master/webapps/northbrick3](https://github.com/nicolasserrano/CS/tree/master/webapps/northbrick3)

# Product edition

In the Servlet ProductEdit, include the other fields of the product:  CategoryId, QuantityPerUnit, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued.
The changes are saved in the servlet ProductUpdate.java

# Category list

Create a Servlet that lists all the categories from the table Categories. Each category row has a link to the existing servlet http://localhost:8080/northbrick3/ProductList?id=categoryId. categoryId is the id of the category.

List of products of a category:
![List of products of a category](https://nicolasserrano.github.io/CS/Java/images/CategoryProductList.jpg)

# Category edition

Create the servlets to edit an existing category

# Order creation

Create the servlets neccesary to add a new product to an existing order.
The next figure shows the order (without the edition button and form)
![Order](https://nicolasserrano.github.io/CS/Java/images/OrderEdit10483.jpg)
and you will need to get the final figure (take into account the discount is a value between 0 an 1).
![Order](https://nicolasserrano.github.io/CS/Java/images/OrderEditLineHTML10483.jpg)

