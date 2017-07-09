package com.ddd.example.infrastructure.datasource.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ddd.example.domain.model.project.Project;
import com.ddd.example.domain.model.project.ProjectRepository;
import com.ddd.example.domain.model.project.ProjectSummaries;
import com.ddd.example.domain.model.project.ProjectSummary;

@Repository
public class ProjectRepositoryImpl implements ProjectRepository {

    @Autowired
    ProjectMapper mapper;

    @Override
    public ProjectSummaries list() {
        List<ProjectSummary> list = this.mapper.list();
        return new ProjectSummaries(list);
    }

    @Override
    public void register(Project project) {
        this.mapper.register(project);
    }
}
