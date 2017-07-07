package com.ddd.example.domain.model.project;

public class ProjectName {

    private String value;

    public ProjectName(String value) {
        this.value = value;
    }

    public ProjectName() {
        this.value = "";
    }

    @Override
    public String toString() {
        return this.value;
    }
}
