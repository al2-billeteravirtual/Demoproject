package com.al2.demo.infrastructure.db.adapter;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends CrudRepository<ClientEntity, Long> {
    List<ClientEntity> findAll();
    ClientEntity findUserByUsername(String username);
}
