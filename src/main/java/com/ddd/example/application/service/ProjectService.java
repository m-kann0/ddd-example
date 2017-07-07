package com.ddd.example.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddd.example.domain.model.project.ProjectRepository;
import com.ddd.example.domain.model.project.ProjectSummaries;

@Service
public class ProjectService {

    @Autowired
    ProjectRepository projectRepository;

    public ProjectSummaries list() {
        return this.projectRepository.list();
    }
}
