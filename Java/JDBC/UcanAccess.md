# Use of Ucanaccess driver with SQuirreL SQL  

## Installation
The driver Ucanacces can be installed with the instructions in <https://github.com/josuneha/JDBC/tree/master/UcanAccess>

## Use with Squirrel
The databases in Access can be managed with the Squirrel application.  
The application is in the Java8 folder: squirrelsql-4.0.0-standard.  

## Add the Ucanaccess driver in Squirrel
Open the Squirrel application.  
In the Drivers tab, create a new driver with the next values:
- Name: Ucanaccess
- Example URL: jdbc:ucanaccess://drive:\path\filename.mdb;showSchema=true
- In the Extra class path add the following files:
  - ucanaccess-5.0.0.jar
  - jackcess-3.0.1.jar
  - hsqldb-2.5.0.jar
  - commons-lang3-3.8.1.jar
  - commons-logging-1.2.jar
- Class Name: net.ucanaccess.jdbc.UcanaccessDriver

Restart the application. 
  
## Add the Alias for the database
Open the Squirrel application.  
In the Aliases tab, create a new alias with the next values:
- Name: Ucanaccess Northwind
- Driver: Ucanaccess
- jdbc:ucanaccess://drive:\path\northbrick.mdb;showSchema=true

Restart the application. 

## Run a Java application
Add the jar files to the classpath:

```
set classpath=%classpath%;D:\Java8\ucanaccess\ucanaccess-5.0.0.jar
set classpath=%classpath%;D:\Java8\ucanaccess\jackcess-3.0.1.jar
set classpath=%classpath%;D:\Java8\ucanaccess\hsqldb-2.5.0.jar
set classpath=%classpath%;D:\Java8\ucanaccess\commons-logging-1.2.jar
set classpath=%classpath%;D:\Java8\ucanaccess\commons-lang3-3.8.1.jar
```

Change the rows:
```
Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

String url="jdbc:ucanaccess://D:/JDBC/northwind.mdb;showSchema=true";


```

Or use current path with ```System.getProperty("user.dir");```

Example:
```
import java.sql.*;
class basicJDBC {
    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        String path = System.getProperty("user.dir");
        System.out.println("path: " + path);
        Connection connection = DriverManager.getConnection("jdbc:ucanaccess://" + path + "/northbrick.mdb");
        
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery("Select * from Shippers");
        while(result.next()) {
            System.out.print(  result.getString("ShipperID")+", ");
            System.out.println(result.getString("CompanyName"));
        }
        connection.close();
    }
}

```

