**_Steps to create a servlet and start it in Tomcat:_**

Note: instructions with jdk1.8.0_131, instructions with jdk1.7.0_80 in [Tomcat_jdk1_7](Tomcat_jdk1_7)

**Start Tomcat**

1. Copy the folder Java8 to a local folder

2. Go to the Java8 folder: >cd path/Java8

3. Execute the sp.bat file: >sp  

4. Start the Tomcat server with the command:
```
startup
```

6. Start the browser and write the address:  
[http://localhost:8082](http://localhost:8082)  

7. Close the Tomcat server with the command:
```
shutdown
```

**Create a Servlet**

1. Step 1 of Start Tomcat  (done)

2. Step 2 of Start Tomcat  (type sv + return)

3. Create the folder structure of  "Servlet1" application in the Tomcat installation  
- Create folder "Servlet1" in webapps folder of Tomcat  
- Create folder WEB-INF in webapps\Servlet1\ folder  
- Create folder classes in webapps\Servlet1\WEB-INF folder  

   ```
   apache-tomcat-8.5.24
   └── webapps
       └── Servlet1
           └── WEB-INF
               └── web.xml
               └── classes
   ```

4. Create the  HelloWorld.java file in the webapps\Servlet1\WEB-INF\classes folder.
HelloWorld.java

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

5. Compile with the command javac:  
```
javac HelloWorld.java
```  

6. Create the **web.xml** file in P:\apache-tomcat-8.5.24\webapps\Servlet1\WEB-INF folder:  

   ```xml
   <?xml version="1.0" encoding="ISO-8859-1"?>
   <web-app>

   <servlet>
     <servlet-name>primer</servlet-name>
     <servlet-class>HelloWorld</servlet-class>
   </servlet>

   <servlet-mapping>
     <servlet-name>primer</servlet-name>
     <url-pattern>/start</url-pattern>
   </servlet-mapping>
   </web-app>
   ```

7. Start the Tomcat server as in step 3 of Start Tomcat:  

   ```
   startup
   ```

8. Start the browser and write the address:  
[http://localhost:8082/Servlet1/start](http://localhost:8082/Servlet1/start)

## Run from pendrive 
With variables for Java, Derby, Squirrel and Apache Tomca

To execute the Java programs from a pendrive follow the next steps:
1. Copy the Java8 folder to your pendrive (or any drive)
2. Insert the pendrive into your computer.
3. See the letter asigned to your pendrive. Example: F
4. Open a Command Prompt Window (type CMD after clicking in the Start button of Windows)
5. Change to the drive whre the file is. Example: >F:
6. Change to the Java8 folder: >cd Java8
7. Type the command sp: >sp
