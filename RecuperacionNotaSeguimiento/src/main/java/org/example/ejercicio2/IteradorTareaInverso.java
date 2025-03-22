package org.example.ejercicio2;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.List;

public class IteradorTareaInverso <T> implements Iterator<Tarea<T>> {
    private ListIterator<Tarea<T>> iteradorLista;

    public IteradorTareaInverso(List<Tarea<T>> tareas) {
        this.iteradorLista = tareas.listIterator(tareas.size());
    }

    public boolean hasNext() {
        return iteradorLista.hasPrevious();
    }

    public Tarea<T> next() {
        return iteradorLista.previous();
    }
}
