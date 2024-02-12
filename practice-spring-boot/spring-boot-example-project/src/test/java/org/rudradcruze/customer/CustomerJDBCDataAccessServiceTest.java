package org.rudradcruze.customer;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.rudradcruze.AbstractTestcontainers;

import java.util.List;
import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThat;


class CustomerJDBCDataAccessServiceTest extends AbstractTestcontainers {

    private CustomerJDBCDataAccessService userTest;
    private final CustomerRowMapper customerRowMapper = new CustomerRowMapper();

    @BeforeEach
    void setUp() {
        userTest = new CustomerJDBCDataAccessService(
                getJdbcTemplate(),
                customerRowMapper
        );
    }

    @Test
    void selectAllCustomers() {
        // Given
        Customer customer = new Customer(
                FAKER.name().fullName(),
                FAKER.internet().safeEmailAddress() + "-" + UUID.randomUUID(),
                20
        );
        userTest.insertCustomer(customer);

        // When
        List<Customer> customers = userTest.selectAllCustomers();

        // Then
        assertThat(customers).isNotEmpty();
    }

    @Test
    void selectCustomerById() {
        // Given

        // When

        // Then
    }

    @Test
    void insertCustomer() {
        // Given

        // When

        // Then
    }

    @Test
    void existsPersonWithEmail() {
        // Given

        // When

        // Then
    }

    @Test
    void deleteCustomer() {
        // Given

        // When

        // Then
    }

    @Test
    void existsPersonWithId() {
        // Given

        // When

        // Then
    }

    @Test
    void updateCustomer() {
        // Given

        // When

        // Then
    }
}