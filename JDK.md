# Java

## JDK, primer programa.
Para escribir, compilar y ejecutar el primer programa en Java, se deben seguir los siguientes pasos, la explicación de los mismos se encuentra en el aparado 1.4.1 del libro:

### 1. Con un editor de texto (Notepad++, Visual Studio Code, Crimson, EditPlus, Notepad, …) escribir el siguiente texto en un fichero. Se deben respetar las minúsculas y mayúsculas.

```
class PrimerPrograma {
     public static void main(String[] args) {
          System.out.println("Hello, World!");
     }
}
```
La construcci&oacute;n de este programa se explica en la p&aacute;gina [Hello, World!](Hello.md)  

### 2. Guardarlo con el nombre “PrimerPrograma.java”

### 3. Abrir una ventana “Command Prompt”. Se realiza desde el botón “start”:
  >start -> Windows System -> Command Prompt
  
  O tecleando 'CMD' en start
  
La informaci&oacute;n de como abrir y utilizar Command Prompt se encuentra en la p&aacute;gina [Cmd](Cmd.md)

### 4. PATH
  Se introducirá el PATH al desarrollar Servlets (instalación con pendrive o JavaStack), para esta práctica se utiliza la configuración por defecto.

### 5. Situarse en el directorio en el que se ha guardado el fichero PrimerPrograma.java, por ejemplo, si se ha guardado en” C:\temp\practicaJava”, se realiza con los comandos:

```
E:
cd \temp
cd practicaJava
```

### 6. Compilar el fichero java con el comando:

```
javac PrimerPrograma.java
```

### 7. Ejecutarlo con el comando:

```
java PrimerPrograma
```

### 8. Se obtendrá el resultado:

```
Hello, World!
```

## Recursos

- [Java tutor](http://www.pythontutor.com/java.html#mode=edit) - [Ejemplo con clases](http://tiny.cc/MyClass) - [Version Java Tutor](https://goo.gl/bxUygg)
- [DrJava](http://www.drjava.org/)
- [NotePad++](tools/notepad.md)
- [Instalar en Pendrive](Tomcat.md#run-from-pendrive)
- [Compilador online](https://www.tutorialspoint.com/compile_java_online.php)
- [IDE GeeksforGeeks](https://ide.geeksforgeeks.org/)
- [Java Tutor](http://pythontutor.com/java.html#mode=edit)
- [More programs](BasicPrograms.md)

---
[Edit](https://github.com/nicolasserrano/CS/edit/master/JDK.md)
<style>
div.container ul, div.container ol {
    padding-left: 1.4em;
}
</style>
