package com.colak.lombok.builder;

import lombok.Builder;

class BuilderTest {

    @Builder
    private static class Customer {
        private String name;
        private String email;
        private int age;
    }

    public static void main() {
        Customer customer = Customer.builder()
                .name("Jane Doe")
                .email("jane@example.com")
                .age(30)
                .build();
        System.out.println(customer);
    }
}
