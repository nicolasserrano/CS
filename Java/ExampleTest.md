# Northbrick application

Install the northbrick application from the files in the folder: 
[https://github.com/nicolasserrano/CS/tree/master/webapps/northbrick3](https://github.com/nicolasserrano/CS/tree/master/webapps/northbrick3)

# Product edition (2 points)

In the Servlet ProductEdit, include the other fields of the product:  CategoryId, QuantityPerUnit, UnitsInStock, UnitsOnOrder, ReorderLevel, Discontinued.
The changes are saved in the servlet ProductUpdate.java

# Category list (3 points, solved in northbrickExampleTest/CategoryList)

Create a Servlet that lists all the categories from the table Categories. Each category row has a link to the existing
servlet ProductList?id=categoryId and another link to the servlet CategoryEdit?id=categoryId. The value of categoryId is the id of a category.

List of categories:
![List of categories](https://nicolasserrano.github.io/CS/Java/images/CategoryList.jpg)

# Category edition (servlet CategoryEdit 3 points, servlet CategoryUpdate 3 points, solved in orthbrickExampleTest/CategoryEdit?id=1)

Create the servlets to edit an existing category. The servlet name and url-pattern is CategoryEdit.
The servlet CategoryEdit show a form with the editable fields of a category (name and description) 
and sends the information to the servlet CategoryUpdate. The servlet CategoryUpdate update the information on the database and shows the list of categories.

Edit of category:
![Edit of category](https://nicolasserrano.github.io/CS/Java/images/CategoryEdit.jpg)


# Order creation (Modification of OrderEdit and orders.js 3 points, servlet OrderDetailInsert 3 points, solved in northbrickExampleTest/OrderEdit?id=10483)

Create the servlets and js files neccesary to add a new product to an existing order
![Order](https://nicolasserrano.github.io/CS/Java/images/OrderEditLine10483.jpg)

# Additional exercise, list of categories (1 point, solved in northbrickExampleTest/CategoryJSONList)

Create the CategoryJSONList that send the data of the categories in a JavaScript array and use a JavaScrip function to create a table. Additionally, you can add other feaures as edit, add, etc.)
![CategoryJSONList](https://nicolasserrano.github.io/CS/Java/images/CategoryJSONList.jpg)

