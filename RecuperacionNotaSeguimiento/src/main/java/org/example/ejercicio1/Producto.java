package org.example.ejercicio1;

public class Producto<T> implements Comparable<Producto<T>> {
    private String nombre;
    private int stock;
    private double precio;

    public Producto(String nombre, int stock, double precio) {
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }

    public String getNombre() { return nombre; }
    public int getStock() { return stock; }
    public double getPrecio() { return precio; }

    @Override
    public int compareTo(Producto<T> otro) {
        return this.nombre.compareTo(otro.nombre);
    }

    @Override
    public String toString() {
        return "Producto{nombre='" + nombre + "', stock=" + stock + ", precio=" + precio + "}";
    }
}
