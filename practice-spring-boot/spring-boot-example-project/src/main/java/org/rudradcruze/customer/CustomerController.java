package org.rudradcruze.customer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("api/v1/customers")
    public List<Customer> getCustomer() {
        return customerService.getAllCustomers();
    }

    @GetMapping("api/v1/customers/{id}")
    public Customer getCustomer(
            @PathVariable("id") Integer customerId) {
        return customerService.getCustomer(customerId);
    }
}