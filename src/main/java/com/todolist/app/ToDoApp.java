package com.todolist.app;

import com.todolist.services.TaskService;
import java.util.Scanner;

public class ToDoApp {

    public static void main(String[] args) {
        TaskService taskService = new TaskService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Agregar tarea\n2. Mostrar tareas\n3. Eliminar tarea\n4. Salir");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la descripción de la tarea:");
                    String descripcion = scanner.nextLine();
                    taskService.addTask(descripcion);
                    break;
                case 2:
                    taskService.listTasks();
                    break;
                case 3:
                    System.out.println("Ingrese el ID de la tarea a eliminar:");
                    int id = scanner.nextInt();
                    taskService.deleteTask(id);
                    break;
                case 4:
                    System.out.println("¡Saliendo de la aplicación!");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
