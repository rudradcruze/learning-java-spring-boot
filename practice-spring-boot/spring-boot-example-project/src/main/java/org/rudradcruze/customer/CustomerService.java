package org.rudradcruze.customer;

import org.rudradcruze.exception.DuplicateResourceException;
import org.rudradcruze.exception.RequestValidationException;
import org.rudradcruze.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService {

    private final CustomerDao customerDao;

    public CustomerService(@Qualifier("jpa") CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public List<Customer> getAllCustomers() {
        return customerDao.selectAllCustomers();
    }

    public Customer getCustomer(Integer id) {
        return customerDao.selectCustomerById(id)
                .orElseThrow(
                        () -> new ResourceNotFoundException("Customer with id [%s] not found" .formatted(id))
                );
    }

    public void addCustomer(CustomerRegistrationRequest customerRegistrationRequest) {
        // check if email exist
        String email = customerRegistrationRequest.email();
        if (customerDao.existsPersonWithEmail(email)) {
            throw new DuplicateResourceException(
                    "Customer with email [%s] not found" .formatted(email)
            );
        }

        // add
        Customer customer = new Customer(
                customerRegistrationRequest.name(),
                customerRegistrationRequest.email(),
                customerRegistrationRequest.age()
        );

        customerDao.insertCustomer(customer);
    }

    public void deleteCustomer(Integer id) {
        // check if id exist
        if (!customerDao.existsPersonWithId(id)) {
            throw new ResourceNotFoundException(
                "Customer with id [%s] not found" .formatted(id)
            );
        }
        // delete
        customerDao.deleteCustomer(id);
    }

    public void updateCustomer(Integer customerId,
                               CustomerUpdateRequest updateRequest) {
        // TODO: for JPA use .getReferenceById(customerId) as it does not bring object into method
        Customer customer = getCustomer(customerId);

        boolean changes = false;

        if (updateRequest.name() != null && !updateRequest.name().equals(customer.getName())) {
            customer.setName(updateRequest.name());
            changes = true;
        }
        if (updateRequest.age() != null && !updateRequest.age().equals(customer.getAge())) {
            customer.setAge(updateRequest.age());
            changes = true;
        }
        if (updateRequest.email() != null && !updateRequest.email().equals(customer.getEmail())) {
            if (customerDao.existsPersonWithEmail(updateRequest.email())) {
                throw new DuplicateResourceException(
                        "email already taken"
                );
            }
            customer.setEmail(updateRequest.email());
            changes = true;
        }

        if (!changes) {
            throw new RequestValidationException("no data changes found");
        }
        customerDao.updateCustomer(customer);
    }
}
