package com.ddd.example.domain.model.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProjectSummaries {

    final List<ProjectSummary> summaries;

    public ProjectSummaries(List<ProjectSummary> summaries) {
        this.summaries = new ArrayList<>(summaries);
    }

    public List<ProjectSummary> getList() {
        return Collections.unmodifiableList(summaries);
    }
}
