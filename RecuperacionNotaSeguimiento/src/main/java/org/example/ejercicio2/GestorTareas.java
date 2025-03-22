package org.example.ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class GestorTareas<T> implements Iterable<Tarea<T>> {
    private List<Tarea<T>> tareas;

    public GestorTareas() {
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(String nombre, String descripcion, String prioridad, String fecha) {
        tareas.add(new Tarea(nombre, descripcion, prioridad, fecha));
        Collections.sort(tareas); //Ordena por fecha
    }

    public boolean eliminarTarea(String nombre) {
        return tareas.removeIf(tarea -> tarea.getNombre().equals(nombre));
    }

    public Tarea<T> encontrarTarea(String nombre) {
        Iterator<Tarea<T>> it = tareas.iterator();
        while (it.hasNext()) {
            Tarea<T> tarea = it.next();
            if (tarea.getNombre().equals(nombre)) {
                return tarea;
            }
        }
        return null;
    }

    @Override
    public Iterator<Tarea<T>> iterator() {
        return new IteradorTareaInverso<>(tareas);
    }
}
