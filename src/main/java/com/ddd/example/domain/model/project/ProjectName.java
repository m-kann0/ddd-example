package com.ddd.example.domain.model.project;

import org.hibernate.validator.constraints.NotEmpty;

public class ProjectName {

    @NotEmpty(message = "プロジェクト名を入力してください。")
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
