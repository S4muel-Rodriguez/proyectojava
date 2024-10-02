package com.todolist.models;

public class PersonalTask extends Task {

    public PersonalTask(int id, String descripcion) {
        super(id, descripcion);
    }

    @Override
    public String getTipo() {
        return "Tarea Personal";
    }
}
