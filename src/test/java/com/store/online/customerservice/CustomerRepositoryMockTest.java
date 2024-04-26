package com.store.online.customerservice;

import com.store.online.customerservice.entity.Customer;
import com.store.online.customerservice.entity.Region;
import com.store.online.customerservice.repository.CustomerRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
public class CustomerRepositoryMockTest {
    @Autowired
    private CustomerRepository customerRepository;

    //TEST REPOSITORY CustomerS
    @Test
    public void whenFindByCategory_thenReturnListCustomer(){

        // CREATE Customer
        Customer customer01 = Customer.builder()
                .numberID("12345678")
                .firstName("computer")
                .lastName("computer")
                .region(Region.builder().id(1L).build())
                .email("manuel@gmail.com")
                .photoUrl("test")
                .state("Created")
                .build();

        // INSERT Customer
        customerRepository.save(customer01);

        // FIND Customer BY CATEGORY
        List<Customer> founds = customerRepository.findByRegion(customer01.getRegion());

        // VALIDATE RESULT
        Assertions.assertThat(founds.size()).isEqualTo(2);
    }
}
