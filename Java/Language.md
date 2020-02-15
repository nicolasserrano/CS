## Tipos de variables

```
boolean  1 byte. Valores true y false
char     2 bytes.Unicode . Comprende el código ASCII.
byte     1 byte. Entero entre -128 y 127
short    2 bytes.Entero entre -32768 y 32767
int      4 bytes.Entero entre -2.147.483.648 y 2.147.483.647
long     8 bytes.Entero entre -9.223.372.036.854.775.808 y 9.223.372.036.854.775.807
float    4 bytes.Real (entre 6 y 7 cifras decimales equivalentes).De -3.402823E38 a -1.401298E-45y de 1.401298E-45 a 3.402823E38
double   8 bytes.Real (15 cifras decimales equivalentes).De -1.79769313486232E308 a -4.94065645841247E-324y de 4.94065645841247E-324a 1.79769313486232E308
```

## Declaración de variables

**Ejemplos de declaración e inicialización de variables:**
```
int x;                          // Declaración de la variable primitiva x. Se inicializa a 0
int y = 5;                      // Declaración de la variable primitiva y. Se inicializa a 5
MyClass unaRef;                 // Declaración de una referencia a un objeto MyClass.
                                // Se inicializa a null
unaRef = new MyClass();         // La referencia “apunta” al nuevo objeto creado
                                // Se ha utilizado el constructor por defecto
MyClass segundaRef = unaRef;    // Declaración de una referencia a un objeto MyClass.
                                // Se inicializa al mismo valor que unaRef
int [] vector;                  // Declaración de un array. Se inicializa a null
vector = new int[10];           // Vector de 10 enteros, inicializados a 0
double [] v ={1.0, 2.65, 3.1};  // Declaración e inicialización de un vector de 3
                                // elementos con los valores entre llaves
MyClass[] lista=new MyClass[5]; // Se crea un vectorde 5 referencias a objetos
                                // Las 5 referencias son inicializadas a null
lista[0] = unaRef;              // Se asigna a lista[0] el mismo valor que unaRef
lista[1] = new MyClass();       // Se asigna a lista[1] la referencia al nuevo objeto
                                // El resto (lista[2]…lista[4] siguen con valor null
```
