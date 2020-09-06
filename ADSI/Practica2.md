# Práctica 2. Relaciones


## Objeto TABLA  
El tipo de objeto **Tabla** permite crear y modificar las tablas de la base de datos, que es donde realmente se almacena toda la información.  

## Objetivo de la práctica  
El objetivo de la práctica es construir una base de datos que controle el consumo de gasoil de los camiones de una empresa de transporte. 

En esta empresa, cuando el transportista reposta en una gasolinera rellena un albaran o vale de suministro de gasoil, donde se indican el nombre de la gasolinera, la matrícula del camión, la fecha, el importe del consumo y el número del cheque con el que ha pagado. Posteriormente, el transportista le entrega a la secretaria del departamento de contabilidad de su empresa esos vales. Esta secretaria debe introducir la información de forma manual en el ordenador rellenando las tablas de la base de datos.  

Antes de comenzar la práctica es conveniente pensar sobre papel la forma de organizar la información. Para ello es necesario identificar y establecer las entidades, atributos, las propiedades de los atributos y las relaciones entre las entidades.  

Los datos que se deben introducir en las tablas están en el fichero [AlbaranesDatos.csv](AlbaranesDatos.csv) utilizado en la [práctica 1](Practica1)

## Pasos para realizar la práctica
- Crear una nueva base de datos en blanco.
- Crear las tablas necesarias y sus campos. Establecer las claves principales de cada tabla. 
- Crear las relaciones entre las tablas. No debe permitirse un código de camión que no esté en la tabla de CAMIONES ni un código de gasolinera que no esté en la tabla de GASOLINERAS. Si es necesario, modificar las tablas según estas necesidades.
- Introducir algunos datos en las tablas (Gasolineras, camiones,…).
- Incorporar una tabla de compañías de gasolineras (COMPANIA). Se desea almacenar el nombre, el precio actual del gasoil y la dirección de la sede. Efectuar su diseño completo y establecer sus relaciones con las tablas existentes. Introducir algunos registros: Petronor, Campsa, Cepsa, Repsol, Avanti, etc.

