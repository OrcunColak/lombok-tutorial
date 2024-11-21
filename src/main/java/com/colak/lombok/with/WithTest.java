package com.colak.lombok.with;

import lombok.AccessLevel;
import lombok.With;
import lombok.extern.slf4j.Slf4j;

// See https://medium.com/@pravin3c/5-lesser-known-yet-powerful-lombok-annotations-fce768a48fcd
// In Lombok v1.18.10, the @With annotation was introduced.
// The @With annotation creates a method for each field that returns a new object instance with one field modified, leaving the original object unchanged.
// This supports the practice of immutability, promoting safer and more predictable code.
@Slf4j
class WithTest {

    @With(AccessLevel.PUBLIC)
    private final String name;

    @With
    private final int age;

    public WithTest(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main() {
        WithTest withTest = new WithTest("John", 30);
        WithTest modifiedWithTest = withTest.withName("Jane");

        log.info("Modified Name: {}", modifiedWithTest.name); // Modified Name: Jane
        log.info("Unchanged Age: {}", modifiedWithTest.age); // Unchanged Age: 30
    }
}
