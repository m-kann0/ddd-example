package com.ddd.example.presentation.controller.project;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ddd.example.application.service.ProjectService;
import com.ddd.example.domain.model.project.Project;

@Controller
public class ProjectRegisterController {

    @Autowired
    ProjectService projectService;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.setAllowedFields("name");
    }

    @ModelAttribute("project")
    public Project project() {
        return new Project();
    }

    @GetMapping("/project/register")
    public String show() {
        return "project/register/form";
    }

    @PostMapping("/project/register")
    public String register(@Valid Project project, BindingResult bindingResult) {
        System.out.println("project: " + project);
        System.out.println("bindingResult: " + bindingResult);
        if (bindingResult.hasErrors()) {
            return "project/register/form";
        }
        this.projectService.register(project);
        return "redirect:/project/list";
    }
}
