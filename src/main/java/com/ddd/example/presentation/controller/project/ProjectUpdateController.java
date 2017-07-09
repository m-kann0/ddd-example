package com.ddd.example.presentation.controller.project;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ddd.example.application.service.ProjectService;
import com.ddd.example.domain.model.project.Project;
import com.ddd.example.domain.model.project.ProjectId;

@Controller
public class ProjectUpdateController {

    private static final Logger log = LoggerFactory.getLogger(ProjectUpdateController.class);

    @Autowired
    ProjectService projectService;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.setAllowedFields("id", "name");
    }

    @GetMapping("/project/update")
    public String show(@RequestParam String id, Model model) {
        Project project = this.projectService.findOne(new ProjectId(id));
        model.addAttribute(project);
        return "project/update/form";
    }

    @PostMapping("/project/update")
    public String update(@Valid Project project, BindingResult bindingResult) {
        log.debug("project: " + project);
        log.debug("bindingResult: " + bindingResult);
        if (bindingResult.hasErrors()) {
            return "project/update/form";
        }
        this.projectService.update(project);
        return "redirect:/project/list";
    }
}
