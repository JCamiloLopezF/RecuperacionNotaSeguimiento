package org.example.ejercicio2;

public class Tarea <T> implements Comparable<Tarea<T>> {

    private String nombre;
    private String descripcion;
    private String prioridad;
    private String fecha;

    public Tarea(String nombre, String descripcion, String prioridad, String fecha) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public int compareTo(Tarea<T> o) {
        return this.fecha.compareTo(o.fecha);
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "nombre='" + nombre + '\'' +
                ", descripción='" + descripcion + '\'' +
                ", prioridad='" + prioridad + '\'' +
                ", fecha='" + fecha + '\'' +
                '}';
    }
}
