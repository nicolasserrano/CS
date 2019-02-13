# Basic programs

Se muestran varios programas en Java. Los pasos para compilarlo se encuentran en [JDK](JDK.md).

## Programa 1

El programa Hello World que se explica en [Hello, World!](Hello.md):
```
class Hello {
    public static void main(String[] args){
        System.out.println("Hello, World!");
    }
}
```

## Programa 2

El programa Name imprime el saludo con el nombre que se pasa al programa:
```
class Name {
    public static void main(String[] args){
        System.out.println("Hello, " + args[0] + "!");
    }
}
```

## Programa 3

El programa Arguments imprime los arguemntos que se pasan al programa:
```
public class Arguments {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(i + ": " + args[i]);
        }
        System.out.println("");
    }
}
```

## Programa 4

El programa Types imprime una variable de tipo booleana y otra de tipo char:
```
class Types {
    public static void main(String[] args)  {
        boolean b = (1 == 2);
        char c = 'a';
        System.out.println("boolean: " + b + "\t\tchar: " + c); 
   }
}
```

## Programa 5

El programa Numbers imprime los distintos tipos de variables num&eacute;ricas de Java:
```
class Numbers {
    public static void main(String[] args)  {
        byte num_b = 1;
        short num_s = 1;
        int num_i = 1;
        long num_l = 1;
        float num_f = 1;
        double num_d = 1;
        for (int i=1; i<70; i++) {
            num_b *= 2;
            num_s *= 2;
            num_i *= 2;
            num_l *= 2;
            num_f *= 2;
            num_d *= 2;
            System.out.println("i: " + i 
              + " \t\tnum_b: " + num_b 
              + " \t\tnum_s: " + num_s 
              + " \t\tnum_i: " + num_i 
              + " \t\tnum_l: " + num_l
              + " \t\tnum_f: " + num_f
              + " \t\tnum_d: " + num_d);
        }
        System.out.println("End");
   }
}
```

## Programa 6

El programa Letters imprime las letras del argumento que se pasa al programa:
```
public class Letters {
    public static void main(String[] args) {
        String nombre = args[0];
        int n = nombre.length();
        String res = "";
        System.out.println(res);
        for (int i=0; i<n; i++) {
            System.out.println(i + ": " + nombre.charAt(i));
        }
    }
}
```
