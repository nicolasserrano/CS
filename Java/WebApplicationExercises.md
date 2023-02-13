# Web Applications in Apache Tomcat

1.	Install Tomcat in your pendrive or hardrive. Instructions in [Tomcat Server](/CS/Tomcat).
2.	Modify HelloWorld Servlet to show: "Welcome to Software Engineering".
3.	Compile the [webapps/northbrick1/WEB-INF/classes/ProductDataMockup.java file](https://github.com/nicolasserrano/CS/blob/master/webapps/northbrick1/WEB-INF/classes/ProductDataMockup.java).
4.	Create a main file that prints the card information of the requested product in the format shown below using the ProductDataMockup class. The requested product is a number from 0 to 3. Example:
```
$> java Test 1
Product id: 2
Name: Homemaker Cupboard 4 x 4 x 4
Supplier: 1
Company name: Brick Manufactures, Co.
Price: 0.0381
```
Notes: 
  - To write the main program you can use [this file (spanish)](https://nicolasserrano.github.io/CS/JDK#jdk-primer-programa) as initial template or [this one (english)](https://books.trinket.io/thinkjava2/chapter1.html#sec11).
  - To see an example of using the ProductDataMockup class you can see the [ProductListMockup class](https://github.com/nicolasserrano/CS/blob/master/webapps/northbrick1/WEB-INF/classes/ProductListMockup.java)
5. Insert before the information of the product the result of the `header()` function and after the information of the product the result of the `footer()` function. These functions are in the [Utils class](https://github.com/nicolasserrano/CS/blob/master/webapps/northbrick1/WEB-INF/classes/Utils.java) and used in the ProductListMockup class. Include the card information between the &lt;PRE&gt; and &lt;/PRE&gt; tags. You can paste the output in an html file and see the result. You can include the style.css file to apply a better style. The result must be:<BR>![ProductCard](images/ProductCard.png)
6.	Deploy the [northbrick1 application](https://github.com/nicolasserrano/CS/blob/master/webapps/northbrick1) in your Tomcat installation (installed in step 1).
7. Create the servlet ProductEditMockup that reads the "id" argument with the identifier of a product an returns a form with the data for that product. This data can be edited by the user. The modified data will be sent to the servlet ProductSave (it is not neccesary to create this servlet at this moment). The servlet will appear as:
![ProductEditMockup](images/ProductEditMockup.png)

