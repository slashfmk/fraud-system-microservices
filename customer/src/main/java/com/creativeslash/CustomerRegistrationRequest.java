package com.creativeslash;

public record CustomerRegistrationRequest(
        String firstname,
        String lastname,
        String email
) {
}
