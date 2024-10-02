package com.todolist.services;

import com.todolist.models.Task;
import com.todolist.models.PersonalTask;
import com.todolist.models.WorkTask;
import com.todolist.exceptions.TaskNotFoundException;

import java.util.ArrayList;
import java.util.List;

public class TaskService {
    private List<Task> tasks;
    private int nextId;

    public TaskService() {
        this.tasks = new ArrayList<>();
        this.nextId = 1;
    }

    public void addTask(String descripcion) {
        Task newTask = new PersonalTask(nextId++, descripcion);
        tasks.add(newTask);
        System.out.println("Tarea agregada: " + newTask.getDescripcion());
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No hay tareas.");
            return;
        }
        for (Task task : tasks) {
            System.out.println(task.getId() + ": " + task.getTipo() + " - " + task.getDescripcion());
        }
    }

    public void deleteTask(int id) {
        try {
            Task task = findTaskById(id);
            tasks.remove(task);
            System.out.println("Tarea eliminada.");
        } catch (TaskNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    private Task findTaskById(int id) throws TaskNotFoundException {
        for (Task task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }
        throw new TaskNotFoundException("Tarea con ID " + id + " no encontrada.");
    }
}
