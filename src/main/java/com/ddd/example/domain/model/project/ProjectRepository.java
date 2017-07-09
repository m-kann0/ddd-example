package com.ddd.example.domain.model.project;

public interface ProjectRepository {

    ProjectSummaries list();

    void register(Project project);
}
