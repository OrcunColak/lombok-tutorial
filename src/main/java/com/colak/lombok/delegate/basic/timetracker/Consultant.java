package com.colak.lombok.delegate.basic.timetracker;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Delegate;

@Getter
@Setter
public class Consultant {
    // Employee properties
    private String name;
    private String id;
    private double hourlyRate;

    // Delegate time tracking functionality
    @Delegate
    private final TimeTracker timeTracker = new TimeTracker();

    public static void main() {

        Consultant lawyer = new Consultant();
        lawyer.setName("Jane Doe");
        lawyer.setHourlyRate(250.0);
        lawyer.clockIn();  // Delegated from TimeTracker
        // ... time passes
        lawyer.clockOut(); // Delegated from TimeTracker
    }

}
