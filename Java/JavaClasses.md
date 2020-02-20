# Clases en Java

Se muestran dos ejercicios de utilización de clases en Java.  

## Programa P2
```
class P2 {
    int posicion;
    int cantidad;
    P2 (int posicion, int cantidad){
        this.posicion = posicion;
        this.cantidad = cantidad;
    }
    void print() {
        System.out.println("posicion: " + posicion + " cantidad: " + cantidad); 
    }
}
```

## Programa Circulo
Este programa crea un objeto Circulo (simplificado) y un método main que utiliza la clase.
Se puede ver el uso de la memoria con la aplicación [Java tutor](http://www.pythontutor.com/java.html#mode=edit)
```
public class Circulo {
    double x;
    double y;
    double r;
    Circulo (double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
    Circulo(double r) {
        this(0.0, 0.0, r);
    }
    Circulo(){
        this(0.0, 0.0, 1.0);
    }
    public static void main(String[] args) {
        Circulo c1;
        c1 = new Circulo(2,3,4);
        Circulo c2 = new Circulo(20,30,40);
        Circulo c3 = new Circulo();
        Circulo[] vec = new Circulo[3];
        vec[0] = c1;
        vec[1] =  new Circulo(5.0);
    }
}
```

## Programa UseCirculo1
Este programa utiliza la clase [Circulo.java](https://q-server.tecnun.es/codex/data/Circulo.java)
```
public class UseCirculo1 {
    public static void main(String[] args) {
       Circulo c1 = new Circulo(Double.parseDouble(args[0]));
       Circulo c2 = new Circulo(Double.parseDouble(args[1]));
       Circulo c3 = new Circulo(Double.parseDouble(args[2]));
       System.out.println(c2.elMayor(c3));
    }
}
```

## Programa UseCirculo
Este programa utiliza la clase [Circulo.java](https://q-server.tecnun.es/codex/data/Circulo.java)
```
public class UseCirculo{
    public static void main(String[] args) {
        Circulo v[] = new Circulo[args.length];
        for (int i = 0; i < args.length; i++) {
            v[i] = new Circulo(Integer.parseInt(args[i]));
        }
        System.out.println(v[args.length - 2]);
        System.out.println(v[args.length - 1]);
    }
}
```

## Class Vector
La clase Vector se define en: https://docs.oracle.com/javase/8/docs/api/java/util/Vector.html

Utilizaremos los siguientes métodos:
```
void addElement(Object)   // Añade un elemento al vector
int size()                //  Devuelve el tamaño del vector
elementAt(int i)          // Devuelve el elemento de la posición i
```
Un ejemplo de un programa que crea un Vector de String e inserta varios elementos, muestra el tamaño y se le pide el primero (0).
```
import java.util.Vector;
public class UseVector{
    public static void main(String[] args) {
        Vector<String> vs = new Vector<String>();
        vs.addElement("Matthew");
        vs.addElement("Mark");
        vs.addElement("Luke");
        vs.addElement("John");
        System.out.println("Size: " + vs.size());
        for (int i=0; i<vs.size(); i++) {
            System.out.println("Element " + i + ": " + vs.elementAt(i));
        }
    }
}
```
