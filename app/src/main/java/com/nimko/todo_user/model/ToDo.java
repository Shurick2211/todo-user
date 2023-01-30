package com.nimko.todo_user.model;

import java.time.LocalDateTime;

public class ToDo {
    private Long id;
    private String toDo;
    private LocalDateTime plannedDateTime;
    private State state;

    public ToDo() {
    }

    public ToDo(String toDo, LocalDateTime plannedDateTime, State state) {
        this.toDo = toDo;
        this.plannedDateTime = plannedDateTime;
        this.state = state;
    }

    public ToDo(Long id, String toDo, LocalDateTime plannedDateTime, State state) {
        this.id = id;
        this.toDo = toDo;
        this.plannedDateTime = plannedDateTime;
        this.state = state;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getToDo() {
        return toDo;
    }

    public void setToDo(String toDo) {
        this.toDo = toDo;
    }

    public LocalDateTime getPlannedDateTime() {
        return plannedDateTime;
    }

    public void setPlannedDateTime(LocalDateTime plannedDateTime) {
        this.plannedDateTime = plannedDateTime;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "id=" + id +
                ", toDo='" + toDo + '\'' +
                ", plannedDateTime=" + plannedDateTime +
                ", state=" + state +
                '}';
    }
}
