package com.jesushenriquez.testing.services.contracts;

import com.jesushenriquez.testing.dtos.requests.CustomerCreateRequest;
import com.jesushenriquez.testing.repositories.entities.CustomerEntity;
import reactor.core.publisher.Mono;

public interface ICustomerManagementService {

    Mono<CustomerEntity> saveCustomer(CustomerCreateRequest customerCreateRequest);
    Mono<CustomerEntity> findCustomer(CustomerCreateRequest customerCreateRequest);

}
