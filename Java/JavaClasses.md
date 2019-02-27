# Clases en Java

Se muestran dos ejercicios de utilización de clases en Java.  

## Programa 1
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

## Programa 2
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

## Programa 3
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
