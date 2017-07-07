package com.ddd.example.infrastructure.datasource.project;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ddd.example.domain.model.project.ProjectSummary;

@Mapper
public interface ProjectMapper {

    List<ProjectSummary> list();
}
