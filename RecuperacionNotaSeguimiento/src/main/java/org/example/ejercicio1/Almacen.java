package org.example.ejercicio1;

import java.util.*;

public class Almacen<T> implements Iterable<Producto<T>> {
    private List<Producto<T>> productos;

    public Almacen() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(String nombre, int stock, double precio) {
        productos.add(new Producto<>(nombre, stock, precio));
    }

    public void ordenarPorPrecio() {
        Collections.sort(productos, new ComparadorPrecio<>());
    }

    public void ordenarPorNombre() {
        Collections.sort(productos);
    }

    @Override
    public Iterator<Producto<T>> iterator() {
        return productos.iterator();
    }
}
