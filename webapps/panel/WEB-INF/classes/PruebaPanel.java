import java.util.*;	//no olvidar poner esta línea

public class PruebaPanel {
    public static void main (String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Prueba de la clase Panel");

        System.out.println("Numero de filas: "); 
        int filas=in.nextInt();
        System.out.println("Numero de columnas: "); 
        int columnas=in.nextInt();
        Panel panel = new Panel(filas, columnas);
        System.out.println("Numero de temperaturas: "); 
        int temp=in.nextInt();
        for (int i=0; i< temp; i++) {
            System.out.println("Numero de fila: "); 
            int fila=in.nextInt();
            System.out.println("Numero de columna: "); 
            int columna=in.nextInt();
            System.out.println("Temperatura: "); 
            double tmp=in.nextDouble();
            panel.setTemperatura(fila, columna, tmp);
        }
        panel.crearEcuaciones();
        panel.output();

    } // Fin de main()
} // Fin de la clase MiPrograma
