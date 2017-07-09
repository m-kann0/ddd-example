package com.ddd.example.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddd.example.domain.model.project.Project;
import com.ddd.example.domain.model.project.ProjectId;
import com.ddd.example.domain.model.project.ProjectRepository;
import com.ddd.example.domain.model.project.ProjectSummaries;

@Service
public class ProjectService {

    @Autowired
    ProjectRepository projectRepository;

    public ProjectSummaries list() {
        return this.projectRepository.list();
    }

    public Project findOne(ProjectId id) {
        return this.projectRepository.findOne(id);
    }

    public void register(Project project) {
        this.projectRepository.register(project);
    }

    public void update(Project project) {
        this.projectRepository.update(project);
    }

    public void delete(ProjectId id) {
        this.projectRepository.delete(id);
    }
}
