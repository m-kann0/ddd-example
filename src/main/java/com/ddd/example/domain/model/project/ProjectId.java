package com.ddd.example.domain.model.project;

public class ProjectId {

    private final Integer value;

    public ProjectId(String value) {
        this.value = Integer.parseInt(value);
    }

    public ProjectId() {
        this.value = null;
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }
}
