package com.colak.lombok.delegate.interfacebased;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Delegate;

import java.time.Duration;
import java.util.Arrays;

@Getter
@Setter
public class SoftwareEngineer {

    private String name;
    private String id;
    private String team;

    @Delegate(types = TimeTracking.class)
    private final TimeTracking timeTracker = new ProjectTimeTracker();

    @Delegate(types = CodeReviewer.class)
    private final CodeReviewer reviewer = new DefaultCodeReviewer();

    public static void main() {
        // Use Case: Managing developer activities in an agile team
        // Example usage:
        SoftwareEngineer developer = new SoftwareEngineer();
        developer.startTracking(); // Start tracking time for current task
        developer.assignReview("PR-123"); // Take on code review responsibility
        developer.submitReview("PR-123", Arrays.asList("Fix naming convention", "Add tests"));
        Duration taskTime = developer.getTrackedTime();
    }
}

