package com.ddd.example.infrastructure.datasource.project;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ddd.example.domain.model.project.Project;
import com.ddd.example.domain.model.project.ProjectId;
import com.ddd.example.domain.model.project.ProjectSummary;

@Mapper
public interface ProjectMapper {

    List<ProjectSummary> list();

    Project findOne(@Param("id") ProjectId id);

    void register(@Param("project") Project project);

    void update(@Param("project") Project project);

    void delete(@Param("id") ProjectId id);
}
