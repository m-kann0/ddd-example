package com.ddd.example.infrastructure.datasource.project;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ddd.example.domain.model.project.Project;
import com.ddd.example.domain.model.project.ProjectSummary;

@Mapper
public interface ProjectMapper {

    List<ProjectSummary> list();

    void register(@Param("project") Project project);
}
