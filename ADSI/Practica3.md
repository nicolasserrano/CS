# Práctica 3. Consultas


## Objeto CONSULTA
El tipo de objeto **Consulta** permite mostrar la información almacenada en las tablas de maneras muy distintas, para poder adecuarse a las necesidades de cada usuario o circunstancia.
Las consultas también pueden permitir insertar, modificar o eliminar datos de las tablas de una manera más cómoda y automatizada.

##	Ejercicio 1. Consultas en la base de datos de albaranes
El objetivo de la práctica es entender el funcionamiento de las consultas, ver cuáles son las operaciones que se pueden realizar con ellas y ser capaces de construir consultas.  

### 1. Consulta de proyección
Consulta en la que se muestre un listado que incluya el número de albarán, el nombre del conductor y el nombre de la gasolinera. Obsérvese que estos campos están almacenados en tablas distintas.
### 2. Consulta de selección
Consulta en la que se obtenga la cantidad de albaranes y el importe total por cada camión en cada gasolinera para un periodo determinado. Este periodo debe introducirse cada vez, al realizar la consulta. Para ello en la casilla de Criteria del campo fecha debe escribirse: BETWEEN [Fecha Inicio] AND [Fecha Final]
### 3. Consulta de referencias cruzadas (crosstab)
Consulta de referencias cruzadas que indique el importe total consumido por cada camión en cada gasolinera. Utilizar para ello una consulta de tipo CrossTab.
### 4. Consulta con totales y ordenación
Consulta de los importes totales y cantidad de albaranes por compañía, ordenada (de mayor a menor) según los importes totales de cada compañía.
### 5. Consulta con expresiones
Consulta que calcule el consumo total de cada camión en litros; suponiendo que el precio se ha mantenido constante.
### 6. Consulta de creación de tabla
Consulta que cree una nueva tabla, llamada Hacienda, en la que se indique el total facturado por cada compañía.
### 7. Consulta de actualización
Consulta que incremente el precio de las gasolineras de CAMPSA un 2%, suponiendo que cada gasolinera puede tener un precio distinto.
### 8. Consulta de borrado
Consulta que borre los albaranes del año 2020 y anteriores (realizar primero una copia con botón derecho -> copy de la tabla para poder recuperar esos datos).
### 9. Consulta anidada
Consulta que muestre el camión que ha repostado más veces en una misma gasolinera, y el número de veces que lo ha hecho. Esta consulta requiere construir más de una consulta.

##	Ejercicio 2. Consultas en Northbrick
La base de datos [Northbrick](https://github.com/nicolasserrano/CS/raw/master/webapps/northbrick3/northbrick_2019.mdb) contiene una implementación del caso de Northbrick.
Realizar las siguientes consultas
### 1. Consulta de agrupación
Consulta en la que se obtenga para cada Categoría de producto, el número de productos de la categoría y el precio mayor de un producto en esa categoría.
### 3. Consulta de comprobación
Consulta que muestre los pedidos en los que el precio es distinto del precio en el producto
### 3. Consulta con totales y ordenación
Consulta que muestre el importe vendido en cada mes. La función que obtiene el mes de un campo fecha es Month(campo) y la que obtiene el año es Year(campo). Para el importe considerar solo el UnitPrice y Quantity, no tener en cuenta el descuento.

##	Ejercicio 3. Consultas del trabajo A de la asignatura
Describir el enunciado y realizar las 2 consultas que debe realizar cada miembro del equipo para el trabajo A de la asignatura. Se debe procurar que sean consultas elaboradas y que su ejecución muestre un resultado relevante para el Sistema de información creado.

<!--[Northbrick](https://aula-virtual.unav.edu/bbcswebdav/pid-1774529-dt-content-rid-5781408_1/xid-5781408_1)  -->
