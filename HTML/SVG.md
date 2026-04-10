## 1. Fundamentos de SVG (Scalable Vector Graphics)

### 1.1. ¿Qué es SVG y por qué en IA?

- **Definición:** Formato basado en XML para describir gráficos vectoriales 2D.
- **Diferencia clave vs Canvas:** SVG es parte del DOM. Cada barra de un histograma es un elemento HTML que puede recibir eventos (`click`, `hover`).
- **Ventajas:** Escalabilidad infinita (crucial para dashboards de alta resolución), accesibilidad y facilidad de estilado mediante CSS.

### 1.2. Elementos Básicos y Atributos

- **El contenedor:** `<svg width="500" height="300" viewBox="0 0 500 300">`
- **Formas primitivas:**
    - `<rect x="" y="" width="" height="" />`
    - `<circle cx="" cy="" r="" />`
    - `<line x1="" y1="" x2="" y2="" />`
    - `<path d="..." />` (La base para gráficos complejos).
 
  [SVG_Elements](SVG_Elements.html)

## 2. Caso Práctico: Creación de un Gráfico de Barras Manual

Para entender cómo las librerías como D3.js funcionan "bajo el capó", visualizaremos un set de datos simple: `[40, 80, 150, 100]`.

```
 <svg width="200" height="200" style="border: 1px solid #ccc">
  <!-- Barra 1 (Valor 40) -->
  <rect x="10" y="160" width="30" height="40" fill="steelblue" />
  <!-- Barra 2 (Valor 80) -->
  <rect x="50" y="120" width="30" height="80" fill="steelblue" />
  <!-- Barra 3 (Valor 150) -->
  <rect x="90" y="50" width="30" height="150" fill="steelblue" />
  <!-- Barra 4 (Valor 100) -->
  <rect x="130" y="100" width="30" height="100" fill="steelblue" />
</svg>
```

 <svg width="200" height="200" style="border: 1px solid #ccc">
  <!-- Barra 1 (Valor 40) -->
  <rect x="10" y="160" width="30" height="40" fill="steelblue" />
  <!-- Barra 2 (Valor 80) -->
  <rect x="50" y="120" width="30" height="80" fill="steelblue" />
  <!-- Barra 3 (Valor 150) -->
  <rect x="90" y="50" width="30" height="150" fill="steelblue" />
  <!-- Barra 4 (Valor 100) -->
  <rect x="130" y="100" width="30" height="100" fill="steelblue" />
</svg>

## 3. Interacción: JavaScript + SVG

Como ingenieros de IA, vuestras visualizaciones deben responder a cambios en los modelos o datos en tiempo real.

### 3.1. Selección y Modificación

```
// Seleccionar un elemento SVG por su ID
const barra = document.getElementById('mi-barra');

// Cambiar un atributo (ej. altura basada en una predicción)
barra.setAttribute('height', '200');
barra.style.fill = 'red';
```

### 3.2. Eventos de Usuario

SVG permite "escuchar" al usuario directamente en los elementos gráficos:

```
rect.addEventListener('mouseover', () => {
    // Mostrar un tooltip con el valor exacto del dato
});
```

## 4. Animación e Interactividad Avanzada

En este bloque demostramos cómo usar JavaScript para inyectar datos dinámicamente y animar la transición.

### Ejemplo: Gráfico de Dispersión Dinámico

Este script genera puntos basados en un array de objetos y aplica una transición suave.

```
const datos = [
    {x: 50, y: 80}, {x: 150, y: 20}, {x: 250, y: 140}
];

const svg = document.querySelector('svg');

datos.forEach(punto => {
    const circulo = document.createElementNS("http://www.w3.org/2000/svg", "circle");
    circulo.setAttribute("cx", punto.x);
    circulo.setAttribute("cy", punto.y);
    circulo.setAttribute("r", 0); // Empezamos en radio 0 para animar
    circulo.style.transition = "r 0.5s ease-out";

    svg.appendChild(circulo);

    // Disparar animación
    setTimeout(() => circulo.setAttribute("r", 10), 100);
});
```
