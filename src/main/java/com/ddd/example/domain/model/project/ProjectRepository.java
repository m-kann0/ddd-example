package com.ddd.example.domain.model.project;

public interface ProjectRepository {

    ProjectSummaries list();

    Project findOne(ProjectId id);

    void register(Project project);

    void update(Project project);
}
