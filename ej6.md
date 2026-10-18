# Ejercicio 6: GestorEtiquetado

## Explicación Lógica
1. **Polimorfismo:** El método `imprimirEtiqueta` acepta un parámetro genérico `ProductoGeek`, permitiendo recibir cualquier subclase derivada.
2. **Enlace Dinámico (Dynamic Binding):** En tiempo de ejecución, la JVM detecta el tipo real del objeto pasado y ejecuta la versión específica correspondiente de `calcularPrecioVenta()`.