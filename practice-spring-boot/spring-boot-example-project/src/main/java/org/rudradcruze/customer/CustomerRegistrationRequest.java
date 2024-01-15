package org.rudradcruze.customer;

public record CustomerRegistrationRequest(
        String name,
        String email,
        Integer age
) {

}
