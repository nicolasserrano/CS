# Java

## JDK, primer programa.
Para escribir, compilar y ejecutar el primer programa en Java, se deben seguir los siguientes pasos, la explicación de los mismos se encuentra en el aparado 1.4.1 del libro:

### 1. Con un editor de texto (Notepad++, Crimson, EditPlus, Notepad, …) escribir el siguiente texto en un fichero. Se deben respetar las minúsculas y mayúsculas.

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
  >start -> Programs -> Accessories -> Command Prompt

### 4. Incluir en la variable PATH, el directorio en que se encuentran las herramientas de compilación y ejecución. Y en la variable CLASSPATH, el directorio en que se encuentran las clases para su ejecución. Para ello, teclear en la ventana Command Prompt:
  
```
set PATH=.;Q:\Java\jdk1.7.0_80\bin;%PATH%
set CLASSPATH=.;%CLASSPATH%
```

### 5. Situarse en el directorio en el que se ha guardado el fichero PrimerPrograma.java, por ejemplo, si se ha guardado en” P:\Infor2\practicaJava”, se realiza con los comandos:

```
P:
cd \infor2
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
Primer programa de Infor 2
```

## Recursos

- [Java tutor](http://www.pythontutor.com/java.html#mode=edit)
- [DrJava](http://www.drjava.org/)
- [NotePad++](tools/notepad++)

---
[Edit](https://github.com/nicolasserrano/CS/edit/master/JDK.md)
<style>
div.container ul, div.container ol {
    padding-left: 1.4em;
}
</style>
