**_Steps to create a servlet and start it in Tomcat:_**

**Start Tomcat**

0. Copy the folder Q:\Java\apache-tomcat-5.5.12 to folder P:\

1.Define the environment variables en the MS-DOS console:

set JAVA_HOME=Q:\JAVA\jdk1.6.0_04

set CATALINA_HOME=P:\apache-tomcat-5.5.12

SET PATH=%JAVA_HOME%\bin;%CATALINA_HOME%\bin;%PATH%

SET CLASSPATH=%CLASSPATH%;%CATALINA_HOME%\common\lib\servlet-api.jar;.

2. Start the Tomcat server with the command:

startup

3. Start the browser and write the address:

http://localhost:8080

  

**Create a Servlet**

Steps 0 and 1 of Start Tomcat

2. Create the folder structure of  "Servlet1" application in the Tomcat installation

Create folder "Servlet1" in webapps folder of Tomcat

Create folder WEB-INF in webapps\Servlet1\ folder

Create folder classes in webapps\Servlet1\WEB-INF folder

3. Create the  HelloWorld.java file in the webapps\Servlet1\WEB-INF\classes folder. HelloWorld.java

```java
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloWorld extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
           throws ServletException, IOException {
       PrintWriter out = response.getWriter();
       out.println("Hello World");
    }
}
```

4. Compile with the command javac:

javac HelloWorld.java

5. Create the **web.xml** file in P:\apache-tomcat-5.5.12\webapps\Servlet1\WEB-INF folder:

&lt;?xml version="1.0" encoding="ISO-8859-1"?&gt;

&lt;web-app&gt;

&lt;servlet&gt;

  &lt;servlet-name&gt;primer&lt;/servlet-name&gt;

  &lt;servlet-class&gt;HelloWorld&lt;/servlet-class&gt;

&lt;/servlet&gt;

&lt;servlet-mapping&gt;

  &lt;servlet-name&gt;primer&lt;/servlet-name&gt;

  &lt;url-pattern&gt;/start&lt;/url-pattern&gt;

&lt;/servlet-mapping&gt;

&lt;/web-app&gt;

6. Start the Tomcat server as in step 3 of Start Tomcat:

startup

7. Start the browser and write the address:

http://localhost:8080/Servlet1/start
