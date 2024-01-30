package org.rudradcruze.customer;

public record CustomerUpdateRequest(
        String name,
        String email,
        Integer age
) {

}
