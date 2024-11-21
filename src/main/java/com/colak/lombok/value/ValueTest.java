package com.colak.lombok.value;

import lombok.Value;
import lombok.extern.slf4j.Slf4j;

// If you’re using Java17, consider using the record type for a better alternative.

// The @Value annotation in Lombok helps create immutable Java objects.
// Using @Value, all fields become private final with getters methods and are included in the constructor.
// It also overrides toString(), hashCode(), and equals() methods.
@Slf4j
class ValueTest {

    @Value
    private static class User {
        String name;
        Integer age;
    }

    public static void main() {
        User user = new User("John", 30);
        log.info("Name: {}", user.getName()); // Name: John
        log.info("Age: {}", user.getAge()); // Age: 30

    }
}
