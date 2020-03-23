import Jama.Matrix;

class Celda {
    boolean set;
    int numero;
    int fila;
    int columna;
    double temperatura;
    double resultado;
};

class Panel {
  int filas;
  int columnas;
  Celda celdas[][];

  public Panel (int filas, int columnas) {
      this.filas = filas;
      this.columnas = columnas;
      System.out.println("New Celda: " + filas + " x " + columnas);
      celdas = new Celda[filas][columnas];
      int k = 0;
      for (int i = 0;i < this.filas ; i++) {
          for (int j = 0;j < this.columnas ; j++) {
              System.out.println("Celda: " + k
                  + " fila: " + i
                  + " columna: " + j);
              celdas[i][j] = new Celda();
              celdas[i][j].set = false;
              celdas[i][j].numero = k;
              celdas[i][j].fila= i;
              celdas[i][j].columna = j;
              k++;
          }
      }
  }

  public void setTemperatura(int fila, int columna, double temperatura) {
//      System.out.println("Set: " + fila + " - " + columna + " - " + temperatura);
      celdas[fila][columna].set = true;
      celdas[fila][columna].temperatura = temperatura;
  }

  public void output() {
      for (int i = 0;i < this.filas ; i++) {
          for (int j = 0;j < this.columnas ; j++) {
              System.out.println("Celda: " + celdas[i][j].numero
                  + " fila: " + celdas[i][j].fila
                  + " columna: " + celdas[i][j].columna
                  + " temperatura: " + celdas[i][j].temperatura
                  + " resultado: " + celdas[i][j].resultado);
          }
      }
  }

  public void crearEcuaciones() {
      int numceldas = filas*columnas;
      Matrix sistema = new Matrix(new double [numceldas][numceldas]);
      Matrix b = new Matrix(new double [numceldas][1]);
      int k = 0;
      for (int i = 0;i < this.filas ; i++) {
          for (int j = 0;j < this.columnas ; j++) {
              if (celdas[i][j].set) {
                  //Temperatura definida
                  sistema.set(k,k,1);
                  b.set(k,0,celdas[i][j].temperatura);
              } else {
                  int total = 0;
                  //celda izquierda
                  if (j > 0) {
                      sistema.set(k,celdas[i][j-1].numero,1);
                      total = total + 1;
                  }
                  //celda derecha
                  if (j < columnas - 1) {
                      sistema.set(k,celdas[i][j+1].numero,1);
                      total = total + 1;
                  }
                  //celda superior
                  if (i > 0) {
                      sistema.set(k,celdas[i-1][j].numero,1);
                      total = total + 1;
                  }
                  //celda inferior
                  if (i < filas - 1) {
                      sistema.set(k,celdas[i+1][j].numero,1);
                      total = total + 1;
                  }
                  b.set(k,0,0);
                  sistema.set(k,celdas[i][j].numero,-total);
              }
              k++;
          }
      }
//      sistema.print(4,1);
//      b.print(4,1);
      Matrix x = sistema.solve(b);
//      x.print(4,1);
      k=0;
      for (int i = 0;i < this.filas ; i++) {
          for (int j = 0;j < this.columnas ; j++) {
              celdas[i][j].resultado = x.get(k,0);
              k++;
          }
      }
  }
}
