package com.al2.demo.infrastructure.db.port;

import com.al2.demo.domain.model.DomainClient;

import java.util.List;

public interface ClientEntityRepository {
    DomainClient getUserByUsername(String username);
    List<DomainClient> getAllUsers();
    void saveClient(DomainClient client);
}
