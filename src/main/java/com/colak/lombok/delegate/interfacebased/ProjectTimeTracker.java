package com.colak.lombok.delegate.interfacebased;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class ProjectTimeTracker implements TimeTracking {
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Map<String, Duration> projectTimings = new HashMap<>();
    private String currentProject;

    @Override
    public void startTracking() {
        this.startTime = LocalDateTime.now();
    }

    @Override
    public void stopTracking() {
        this.endTime = LocalDateTime.now();
        Duration duration = Duration.between(startTime, endTime);
        if (currentProject != null) {
            projectTimings.merge(currentProject, duration, Duration::plus);
        }
    }

    @Override
    public Duration getTrackedTime() {
        if (startTime == null || endTime == null) {
            return Duration.ZERO;
        }
        return Duration.between(startTime, endTime);
    }

    @Override
    public Map<String, Duration> getProjectTimings() {
        return new HashMap<>(projectTimings);
    }

    public void setCurrentProject(String projectId) {
        this.currentProject = projectId;
    }
}
