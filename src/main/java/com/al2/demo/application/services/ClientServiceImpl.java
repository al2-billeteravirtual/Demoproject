package com.al2.demo.application.services;

import com.al2.demo.application.interfaces.ClientService;
import com.al2.demo.domain.model.DomainClient;
import com.al2.demo.infrastructure.db.port.ClientEntityRepository;
import com.al2.demo.infrastructure.api.adapters.ClientDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientEntityRepository clientEntityRepository;

    public ClientServiceImpl(ClientEntityRepository clientEntityRepository) {
        this.clientEntityRepository = clientEntityRepository;
    }


    public List<DomainClient> getAllUsers(){
        return clientEntityRepository.getAllUsers();
    }

    public DomainClient getUserByUsername(String username){
        return clientEntityRepository.getUserByUsername(username);
    }

    public DomainClient createUser(DomainClient client) {
        clientEntityRepository.saveClient(client);
        return client;
    }
}
