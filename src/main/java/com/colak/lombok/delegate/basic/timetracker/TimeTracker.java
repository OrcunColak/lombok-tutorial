package com.colak.lombok.delegate.basic.timetracker;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

class TimeTracker {
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Map<LocalDate, Duration> dailyWorkHours = new HashMap<>();

    // Time tracking methods
    public void clockIn() {
        this.startTime = LocalDateTime.now();
    }

    public void clockOut() {
        this.endTime = LocalDateTime.now();
        Duration workDuration = Duration.between(startTime, endTime);
        dailyWorkHours.put(LocalDate.now(), workDuration);
    }
}
