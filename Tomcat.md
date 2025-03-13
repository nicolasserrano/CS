**Install JavaStack in your computer:**

1. Create a folder with permission to write (in your user folder or in C:\temp). For example:
C:\temp\Tomcat

2. Copy the following folders from C:\Programs\JavaStack\apache-tomcat-9.0.89 to C:\temp\Tomcat
- conf
- logs
- temp
- webapps
- work

Note: to reduce space, you can delete the folders _docs_ and _examples_ from webapps.

3. Create the file [sj.bat](https://github.com/nicolasserrano/CS/blob/master/sj.bat) in C:\temp\Tomcat

4. Execute the sj file:
```
C:\temp\Tomcat>sj
```

 This will have defined the variables:
```bash
set CATALINA_BASE=C:\temp\Tomcat
set CATALINA_HOME=C:\Programs\JavaStack\apache-tomcat-9.0.89
set JAVA_HOME=C:\Programs\JavaStack\jdk1.8.0_131
```

**Start Tomcat**

1. Steps of "Install JavaStack in your computer"

2. Go to your Tomcat folder and execute the sj.bat file:
```
C:\temp\Tomcat>sj
```

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

**Create a Web page on the server**

1. Steps of "Install JavaStack in your computer"

2. Go to your Tomcat folder and execute the sj.bat file:
```
C:\temp\Tomcat>sj
```

3. Create a folder called 'firstWeb' in the webapps folder of the CATALINA_BASE folder.

4. Create the index.html file in the webapps\firstWeb folder with some html content

5. Start the Tomcat server as in step 4 of Start Tomcat:  

   ```
   startup
   ```

6. Start the browser and write the address:  
[http://localhost:8082/firstWeb](http://localhost:8082/firstWeb)


**Create a Servlet**

1. Steps of "Install JavaStack in your computer"

2. Go to your Tomcat folder and execute the sj.bat file:
```
C:\temp\Tomcat>sj
```

3. Create the folder structure of  "Servlet1" application in the Tomcat installation  
- Create folder "Servlet1" in webapps folder of Tomcat  
- Create folder WEB-INF in webapps\Servlet1\ folder  
- Create folder classes in webapps\Servlet1\WEB-INF folder  

   ```
  CATALINA_BASE
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

6. Create the **web.xml** file in C:\temp\Tomcat\webapps\Servlet1\WEB-INF folder:  

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

7. Start the Tomcat server as in step 4 of Start Tomcat:  

   ```
   startup
   ```

8. Start the browser and write the address:  
[http://localhost:8082/Servlet1/start](http://localhost:8082/Servlet1/start)

To try other apps, download CS repository from [https://github.com/nicolasserrano/CS](https://github.com/nicolasserrano/CS) and copy some webapps to your webapps

## Run from pendrive 
- Copy the C:\Programs\JavaStack forlder to your pendrive, for example: E:\Programs\JavaStack
- Use the pendrive instead of your user folder or C:\Temp
- Do the same process
