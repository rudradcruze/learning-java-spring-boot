package org.rudradcruze.customer;

import org.flywaydb.core.internal.resource.ResourceNameValidator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.rudradcruze.exception.DuplicateResourceException;
import org.rudradcruze.exception.RequestValidationException;
import org.rudradcruze.exception.ResourceNotFoundException;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CustomerServiceTest {

    @Mock
    private CustomerDao customerDao;
    private CustomerService underTest;

    @BeforeEach
    void setUp() {
        underTest = new CustomerService(customerDao);
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    void getAllCustomers() {
        // When
        underTest.getAllCustomers();

        // Then
        verify(customerDao).selectAllCustomers();
    }

    @Test
    void canGetCustomer() {
        // Given
        int id = 10;
        Customer customer = new Customer(
                (long) id, "Alex", "alex@gmail.com", 19
        );
        when(customerDao.selectCustomerById(id)).thenReturn(Optional.of(customer));

        // When
        Customer actual = underTest.getCustomer(id);

        // Then
        assertThat(actual).isEqualTo(customer);
    }

    @Test
    void willThrowWhenGetCustomerReturnEmptyOptional() {
        // Given
        int id = 10;
        when(customerDao.selectCustomerById(id)).thenReturn(Optional.empty());

        // When
        // Then
        assertThatThrownBy(() -> underTest.getCustomer(id))
                .isInstanceOf(ResourceNotFoundException.class)
                .hasMessageContaining(
                        "Customer with id [%s] not found".formatted(id));
    }

    @Test
    void addCustomer() {
        // Given
        String email = "alex@gmail.com";
        when(customerDao.existsPersonWithEmail(email)).thenReturn(false);

        CustomerRegistrationRequest request = new CustomerRegistrationRequest(
                "Alex",
                email,
                19
        );

        // When
        underTest.addCustomer(request);

        // Then
        ArgumentCaptor<Customer> customerArgumentCaptor = ArgumentCaptor.forClass(
                Customer.class
        );
        verify(customerDao).insertCustomer(customerArgumentCaptor.capture());

        Customer capturedCustomer = customerArgumentCaptor.getValue();

        assertThat(capturedCustomer.getId()).isNull();
        assertThat(capturedCustomer.getName()).isEqualTo(request.name());
        assertThat(capturedCustomer.getEmail()).isEqualTo(request.email());
        assertThat(capturedCustomer.getAge()).isEqualTo(request.age());
    }

    @Test
    void willThrowWhenEmailExistWhileAddingACustomer() {
        // Given
        String email = "alex@gmail.com";
        when(customerDao.existsPersonWithEmail(email)).thenReturn(true);

        CustomerRegistrationRequest request = new CustomerRegistrationRequest(
                "Alex",
                email,
                19
        );

        // When
        assertThatThrownBy(() -> underTest.addCustomer(request))
                .isInstanceOf(DuplicateResourceException.class)
                .hasMessage("Customer with email [%s] already taken" .formatted(email));

        // Then
        verify(customerDao, never()).insertCustomer(any());
    }

    @Test
    void deleteCustomerById() {
        // Given
        int id = 10;

        when(customerDao.existsPersonWithId(id)).thenReturn(true);

        // When
        underTest.deleteCustomer(id);

        // Then
        verify(customerDao).deleteCustomer(id);
    }

    @Test
    void willThrowDeleteCustomerByIdNotExist() {
        // Given
        int id = 10;

        when(customerDao.existsPersonWithId(id)).thenReturn(false);

        // When
        assertThatThrownBy(() -> underTest.deleteCustomer(id))
                .isInstanceOf(ResourceNotFoundException.class)
                        .hasMessage("Customer with id [%s] not found".formatted(id));

        // Then
        verify(customerDao, never()).deleteCustomer(id);
    }

    @Test
    void canUpdateAllCustomersProperties() {
        // Given
        int id = 10;
        Customer customer = new Customer(
                (long) id, "Alex", "alex@gmail.com", 19
        );
        when(customerDao.selectCustomerById(id)).thenReturn(Optional.of(customer));

        String newEmail = "alexdasai@gmail.com";

        CustomerUpdateRequest updateRequest = new CustomerUpdateRequest("Alex Dasai", newEmail, 23);

        when(customerDao.existsPersonWithEmail(newEmail)).thenReturn(false);

        // When
        underTest.updateCustomer(id, updateRequest);

        // Then
        ArgumentCaptor<Customer> customerArgumentCaptor =
                ArgumentCaptor.forClass(Customer.class);
        verify(customerDao).updateCustomer(customerArgumentCaptor.capture());
        Customer captureCustomer = customerArgumentCaptor.getValue();

        assertThat(captureCustomer.getAge()).isEqualTo(updateRequest.age());
        assertThat(captureCustomer.getName()).isEqualTo(updateRequest.name());
        assertThat(captureCustomer.getEmail()).isEqualTo(updateRequest.email());
    }

    @Test
    void canUpdateOnlyCustomerName() {
        // Given
        int id = 10;
        Customer customer = new Customer(
                (long) id, "Alex", "alex@gmail.com", 19
        );
        when(customerDao.selectCustomerById(id)).thenReturn(Optional.of(customer));

        CustomerUpdateRequest updateRequest = new CustomerUpdateRequest("Alex Dasai", null, null);

        // When
        underTest.updateCustomer(id, updateRequest);

        // Then
        ArgumentCaptor<Customer> customerArgumentCaptor =
                ArgumentCaptor.forClass(Customer.class);
        verify(customerDao).updateCustomer(customerArgumentCaptor.capture());
        Customer captureCustomer = customerArgumentCaptor.getValue();

        assertThat(captureCustomer.getAge()).isEqualTo(customer.getAge());
        assertThat(captureCustomer.getName()).isEqualTo(updateRequest.name());
        assertThat(captureCustomer.getEmail()).isEqualTo(customer.getEmail());
    }

    @Test
    void canUpdateOnlyCustomerEmail() {
        // Given
        int id = 10;
        Customer customer = new Customer(
                (long) id, "Alex", "alex@gmail.com", 19
        );
        when(customerDao.selectCustomerById(id)).thenReturn(Optional.of(customer));

        String newEmail = "alexdasai@gmail.com";

        CustomerUpdateRequest updateRequest = new CustomerUpdateRequest(null, newEmail, null);

        when(customerDao.existsPersonWithEmail(newEmail)).thenReturn(false);

        // When
        underTest.updateCustomer(id, updateRequest);

        // Then
        ArgumentCaptor<Customer> customerArgumentCaptor =
                ArgumentCaptor.forClass(Customer.class);
        verify(customerDao).updateCustomer(customerArgumentCaptor.capture());
        Customer captureCustomer = customerArgumentCaptor.getValue();

        assertThat(captureCustomer.getAge()).isEqualTo(customer.getAge());
        assertThat(captureCustomer.getName()).isEqualTo(customer.getName());
        assertThat(captureCustomer.getEmail()).isEqualTo(newEmail);
    }

    @Test
    void canUpdateOnlyCustomerAge() {
        // Given
        int id = 10;
        Customer customer = new Customer(
                (long) id, "Alex", "alex@gmail.com", 19
        );
        when(customerDao.selectCustomerById(id)).thenReturn(Optional.of(customer));

        CustomerUpdateRequest updateRequest = new CustomerUpdateRequest(null, null, 23);

        // When
        underTest.updateCustomer(id, updateRequest);

        // Then
        ArgumentCaptor<Customer> customerArgumentCaptor =
                ArgumentCaptor.forClass(Customer.class);
        verify(customerDao).updateCustomer(customerArgumentCaptor.capture());
        Customer captureCustomer = customerArgumentCaptor.getValue();

        assertThat(captureCustomer.getAge()).isEqualTo(updateRequest.age());
        assertThat(captureCustomer.getName()).isEqualTo(customer.getName());
        assertThat(captureCustomer.getEmail()).isEqualTo(customer.getEmail());
    }

    @Test
    void willThrowWhenTryingToUpdateCustomerEmailWhenAlreadyTaken() {
        // Given
        int id = 10;
        Customer customer = new Customer(
                (long) id, "Alex", "alex@gmail.com", 19
        );
        when(customerDao.selectCustomerById(id)).thenReturn(Optional.of(customer));

        String newEmail = "alexdasai@gmail.com";

        CustomerUpdateRequest updateRequest = new CustomerUpdateRequest(null, newEmail, null);

        when(customerDao.existsPersonWithEmail(newEmail)).thenReturn(true);

        // When
        assertThatThrownBy(() -> underTest.updateCustomer(id, updateRequest))
                .isInstanceOf(DuplicateResourceException.class)
                .hasMessage("email already taken");

        // Then
        verify(customerDao, never()).updateCustomer(any());
    }

    @Test
    void willThrowWhenCustomerUpdateHasNoChange() {
        // Given
        int id = 10;
        Customer customer = new Customer(
                (long) id, "Alex", "alex@gmail.com", 19
        );
        when(customerDao.selectCustomerById(id)).thenReturn(Optional.of(customer));

        CustomerUpdateRequest updateRequest = new CustomerUpdateRequest(customer.getName(), customer.getEmail(), customer.getAge());

        // When
        assertThatThrownBy(() -> underTest.updateCustomer(id, updateRequest))
                .isInstanceOf(RequestValidationException.class)
                .hasMessage("no data changes found");

        // Then
        verify(customerDao, never()).updateCustomer(any());
    }

}