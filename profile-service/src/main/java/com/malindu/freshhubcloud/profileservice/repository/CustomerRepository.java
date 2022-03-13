package com.malindu.freshhubcloud.profileservice.repository;


import com.malindu.freshhubcloud.commons.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {
}
