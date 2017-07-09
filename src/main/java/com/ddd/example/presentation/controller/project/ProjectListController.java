package com.ddd.example.presentation.controller.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.ddd.example.application.service.ProjectService;
import com.ddd.example.domain.model.project.ProjectId;
import com.ddd.example.domain.model.project.ProjectSummaries;

@Controller
public class ProjectListController {

    @Autowired
    ProjectService projectService;

    @ModelAttribute("projectSummaries")
    public ProjectSummaries projectSummaries() {
        return this.projectService.list();
    }

    @GetMapping("/project/list")
    public String list() {
        return "project/list";
    }

    @GetMapping("/project/delete")
    public String delete(@RequestParam String id) {
        this.projectService.delete(new ProjectId(id));
        return "redirect:/project/list";
    }
}
