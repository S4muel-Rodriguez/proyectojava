package com.todolist.models;

public abstract class Task {
    protected int id;
    protected String descripcion;

    public Task(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public abstract String getTipo();

    public String getDescripcion() {
        return descripcion;
    }

    public int getId() {
        return id;
    }
}
