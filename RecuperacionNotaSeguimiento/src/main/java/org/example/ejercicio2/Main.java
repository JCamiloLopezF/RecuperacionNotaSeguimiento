package org.example.ejercicio2;

public class Main {

        public static void main(String[] args) {
            GestorTareas<String> gestor = new GestorTareas<>();

            gestor.agregarTarea("Project Review", "Review Q1 Project", "High", "2024-03-21");
            gestor.agregarTarea("Team Meeting", "Weekly Sync", "Medium", "2024-03-20");
            gestor.agregarTarea("Documentation", "Update API docs", "Low", "2024-03-19");

            // La más reciente primero
            System.out.println("Tareas en orden cronológico inverso: ");
            for (Tarea<String> tarea : gestor) {
                System.out.println(tarea);
            }

            // Encontrar una tarea
            Tarea<String> foundTask = gestor.encontrarTarea("Team Meeting");
            System.out.println("\nTarea encontrada: " + foundTask);

            // Eliminar una tarea
            gestor.eliminarTarea("Documentation");

            // Print remaining tasks
            System.out.println("\nTareas restantes después de eliminar:");
            for (Tarea<String> tarea : gestor) {
                System.out.println(tarea);
            }
        }
    }

