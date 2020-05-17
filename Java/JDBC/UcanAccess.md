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

Restart the application. 
  
## Add the Aliass for the database
Open the Squirrel application.  
In the Aliasses tab, create a new alias with the next values:
- Name: Ucanaccess Northwind
- Driver: Ucanaccess
- jdbc:ucanaccess://drive:\path\northbrick.mdb;showSchema=true

Restart the application. 
