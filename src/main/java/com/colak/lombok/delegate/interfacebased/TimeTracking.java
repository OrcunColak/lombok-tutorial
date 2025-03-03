package com.colak.lombok.delegate.interfacebased;

import java.time.Duration;
import java.util.Map;

public interface TimeTracking {
    void startTracking();
    void stopTracking();
    Duration getTrackedTime();
    Map<String, Duration> getProjectTimings();
}
