package org.example.ejercicio1;

public class Main {
    public static void main(String[] args) {
        Almacen<String> almacen = new Almacen<>();

        // Agregar productos
        almacen.agregarProducto("Laptop", 10, 999.99);
        almacen.agregarProducto("Mouse", 20, 29.99);
        almacen.agregarProducto("Teclado", 15, 59.99);

        // Mostrar productos en orden natural (por nombre)
        System.out.println("Productos en orden natural:");
        almacen.ordenarPorNombre();
        for (Producto<String> producto : almacen) {
            System.out.println(producto);
        }

        // Mostrar productos ordenados por precio
        System.out.println("\nProductos ordenados por precio:");
        almacen.ordenarPorPrecio();
        for (Producto<String> producto : almacen) {
            System.out.println(producto);
        }
    }
}