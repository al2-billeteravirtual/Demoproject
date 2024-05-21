package com.al2.demo.application.interfaces;

import com.al2.demo.domain.model.DomainClient;
import com.al2.demo.infrastructure.api.adapters.ClientDTO;

import java.util.List;

public interface ClientService {
    List<DomainClient> getAllUsers();

    DomainClient getUserByUsername(String username);

    DomainClient createUser(DomainClient clientDTO);
}
