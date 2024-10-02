package com.todolist.models;

public class WorkTask extends Task {

    public WorkTask(int id, String descripcion) {
        super(id, descripcion);
    }

    @Override
    public String getTipo() {
        return "Tarea de Trabajo";
    }
}
