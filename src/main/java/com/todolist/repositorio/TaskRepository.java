package com.todolist.repositories;

import com.todolist.models.Task;

public interface TaskRepository {
    void saveTask(Task task);
    Task findTaskById(int id);
    void deleteTask(Task task);
}
