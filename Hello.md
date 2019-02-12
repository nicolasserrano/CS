# Hello, World!

Pasos para crear el primer programa de Java. Los pasos para compilarlo se encuentran en [JDK](JDK.md) y para utilizar el Command Prompt en [Cmd](Cmd.md)

## Paso 1
El fichero mas simple que se puede compilar en Java es un fichero vacío. Se guarda con el nombre A.java  
Compilar con el comando:
```
javac A.java
```

No da ning&uacute;n error, y tampoco produce ning&uacute;n resultado

## Paso 2
La clase más básica es la siguietne:
```
class A{}
```
Compilar con el mismo comando:
```
javac A.java
```
Produce el fichero A.class, se puede ver con el comando

```
dir A.*
```

## Paso 3
Al ejecutar la clase con el comando
```
java A
```
Se obtiene el mensaje:
```
Error: Main method not found in class A, please define the main method as:
   public static void main(String[] args)
```
Por tanto se incluye este m&eacute;todo en la clase A.
```
class A {
    public static void main(String[] args){
    }
}
```
Ahora se puede compilar y ejecutar:
```
javac A.java
java A
```
La ejecuci&oacute;n no da ning&uacute;n error pero tampoco produce ning&uacute;n resultado.

## Paso 4
Para que imprima se incluye la l&iacute;nea:
```
    System.out.println("Hello, World!");
```

El programa final es:
```
class A {
    public static void main(String[] args){
        System.out.println("Hello, World!");
    }
}
```
