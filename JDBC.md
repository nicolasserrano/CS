# JDBC

## Driver system

<iframe src="//www.emblogic.com/22/linux-device-drivers" width="1200" height="800" frameborder="0" marginwidth="0" marginheight="0" scrolling="yes" style="border:1px solid #CCC; border-width:1px; margin-bottom:5px; max-width: 100%;" allowfullscreen> </iframe>
???
https://www.emblogic.com/22/linux-device-drivers

## Printer manager
Menu -> Print -> Print using system dialog...

- Application
- Printer manager
- Printer driver
- Printer

## ODBC (Open Database Connectivity)
ODBC is an API for accessing DBMS (Database Management Systems)

- Application
- ODBC driver manager
- ODBC driver
- DBMS

ODBC Model (Oracle): https://docs.oracle.com/database/121/ADFNS/adfns_odbc.htm#BABEIGEE

Windows odbc manager: odbcad32  
With Windows 64 bits: C:\Windows\System32\odbcad32.exe (yes, System32 is for 64 bits systems)  
With Windows 32 bits: C:\Windows\SysWOW64\odbcad32.exe (WOW64 means Windows on Windows 64, so it's for 32 bits systems)  
   
## JDBC architecture  

![JDBC Architecture](/images/JDBC_blue.png)

Oracle tutorial:  <http://docs.oracle.com/javase/tutorial/jdbc/overview/index.html>

## JDBC architecture (2)

<img src="https://raw.githubusercontent.com/nicolasserrano/CS/master/images/JDBC_blue.png" alt="JDBC Architecture" width="60%">

Oracle tutorial:  <http://docs.oracle.com/javase/tutorial/jdbc/overview/index.html>

## Examples:

- [basicJDBC.java](https://github.com/nicolasserrano/CS/blob/master/Java/JDBC/basicJDBC.java)  
- [firstJDBC.java](https://github.com/nicolasserrano/CS/blob/master/Java/JDBC/firstJDBC.java)

### File ResultAppSQL.java

```
import java.sql.*;
class basicJDBC {
    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection connection = DriverManager.getConnection("jdbc:odbc:basic");
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery("Select titulo, autor from datos");
        while(result.next()) {
            System.out.print(  result.getString("titulo")+", ");
            System.out.println(result.getString("autor"));
        }
        connection.close();
    }
}
```

## JDBC and Dates
- Example of using Dates with Access [java file](https://github.com/nicolasserrano/CS/blob/master/Java/JDBC/JDBC_Date.java)
- Database for the example: [northbrick database](https://github.com/nicolasserrano/CS/blob/master/webapps/northbrick3/northbrick.mdb)
### References
- SimpleDateFormat explained in tutorial [Java SimpleDateFormat](http://tutorials.jenkov.com/java-internationalization/simpledateformat.html)
- Adding and substracting dates in [question at stackoverflow](https://stackoverflow.com/questions/3581258/adding-n-hours-to-a-date-in-java)
- Calendar and GregorianCalendar in [question at stackoverflow](https://stackoverflow.com/questions/46705472/difference-between-gregoriancalendar-class-and-calendar-class-in-java)

## JDBC and Servlets  

### Servlet structure with JDBC (methods init and doGet)  
- [Presentation](https://www.dropbox.com/s/kbrt9acq38m8py8/ServletsDB.ppt?dl=0), and [example](http://www4.tecnun.es/asignaturas/Informat3/Apoyo_Clases/Ejemplos_Servlets_JDBC/Ejemplo2.html)
- Example: <http://www4.tecnun.es/asignaturas/Informat2/Material/Libro/IngSoft/Practica9.pdf>

### API java.sql  
[API java.sql](http://docs.oracle.com/javase/6/docs/api/index.html?java/sql/package-summary.html)

### Metadate  
- [ResultAppSQL](https://github.com/nicolasserrano/CS/blob/master/Java/JDBC/ResultAppSQL.java)
- [ExecuteSQL.java](https://github.com/nicolasserrano/CS/blob/master/Java/JDBC/ExecuteSQL.java)

###   jdbc:odbc without DSN
ODBC driver in JDBC:
java firstJDBC "Driver={Microsoft Access Driver (*.mdb)};Dbq=Libros.mdb" "Select * from datos" autor titulo  
```
ServletContext context = getServletConfig( ).getServletContext();
String url=new String("jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)};Dbq=" + context.getRealPath("Libros.mdb"));
```

### PreparedStatement  
[PreparedStatement](http://svn.apache.org/repos/asf/db/derby/code/trunk/java/demo/toursdb/insertMaps.java)  

### Derby  
```
F:\Java\db-derby-10.9.1.0-bin iniciar.bat
F:
SET JAVA_PC=F:\Java
SET JAVA_HOME=%JAVA_PC%\jdk1.6.0_04
SET PATH=%JAVA_HOME%\bin;%PATH%
set install=%JAVA_PC%\db-derby-10.9.1.0-bin
set classpath=%install%\lib\derbytools.jar;%install%\lib\derby.jar;%install%
cd %install%\demo\programs
java org.apache.derby.tools.ij

Para crear la base de datos Derby:
CONNECT 'jdbc:derby:firstdb;create=true';

Comandos:
ij> connect 'jdbc:derby:dbdetective';
ij> show tables;
ij> select * from user1.employee where Last_name like 'T%';
```

### Squirrel  
```
set path=C:\Java\Squirrel-sql-2.6.5a;%path%
squirrel-sql.bat
```

### Derby in server mode  
set the driver with file: derbynet.jar in CLASSPATH:
```
     set classpath=F:\Java\db-derby-10.9.1.0-bin\lib\derbynet.jar;%classpath%
```
start the server
```
java org.apache.derby.drda.NetworkServerControl start
```
Explianed in http://db.apache.org/derby/integrate/SQuirreL_Derby.html

Example of Squirrel with DerbyNet (server mode):
url:  jdbc:derby://localhost:1527/d:/folderpath//Java/ClientDB;create=true

## Uses of data  

### JS charts and graphs  
- Drawing with JavaScript in a canvas [run](https://nicolasserrano.github.io/CS/JavaScript/graphics/canvas.html) [source](JavaScript/graphics/canvas.html)
- Using Dygraph library [run](https://nicolasserrano.github.io/CS/JavaScript/graphics/newton.html) [source](JavaScript/graphics/newton.html)
- [Google charts](https://developers.google.com/chart/interactive/docs/gallery) [example in SMR](http://smr-project-test.appspot.com/UserPage?PageKey=5677751478517760)
- [Raphael JS](http://dmitrybaranovskiy.github.io/raphael/) [Basic example](https://nicolasserrano.github.io/CS/JavaScript/graphics/basicRaphael.html)
- [D3.js](https://d3js.org/) [Tutorial](https://www.dashingd3js.com/table-of-contents) [Book: Interactive Data Visualization for the Web by Scott Murray](http://chimera.labs.oreilly.com/books/1230000000345) [online](http://chimera.labs.oreilly.com/books/1230000000345/index.html) [index in pdf](http://cdn.oreillystatic.com/oreilly/booksamplers/9781449339739_sampler.pdf)
- [Other libraries](https://www.slant.co/versus/10577/140/~d3-js_vs_raphael)

### SOA (Service Oriented Architecture)

### Server Sent Events


---
[Edit](https://github.com/nicolasserrano/CS/edit/master/JDBC.md)
<style>
div.container ul, div.container ol {
    padding-left: 1.4em;
}
</style>
