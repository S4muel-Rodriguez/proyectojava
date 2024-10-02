package com.todolist.repositories;

import com.todolist.models.Task;
import com.todolist.services.DatabaseService;

public class JPATaskRepository implements TaskRepository {

    private DatabaseService dbService;

    public JPATaskRepository() {
        dbService = new DatabaseService();
    }

    @Override
    public void saveTask(Task task) {
        dbService.getEntityManager().getTransaction().begin();
        dbService.getEntityManager().persist(task);
        dbService.getEntityManager().getTransaction().commit();
    }

    @Override
    public Task findTaskById(int id) {
        return dbService.getEntityManager().find(Task.class, id);
    }

    @Override
    public void deleteTask(Task task) {
        dbService.getEntityManager().getTransaction().begin();
        dbService.getEntityManager().remove(task);
        dbService.getEntityManager().getTransaction().commit();
    }
}

