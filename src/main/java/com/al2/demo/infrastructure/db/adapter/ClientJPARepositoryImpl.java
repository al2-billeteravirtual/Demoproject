package com.al2.demo.infrastructure.db.adapter;

import com.al2.demo.domain.model.DomainClient;
import com.al2.demo.infrastructure.db.port.ClientEntityRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientJPARepositoryImpl implements ClientEntityRepository {

    private final ClientRepository clientJPARepository;
    private final ObjectMapper mapper;

    public ClientJPARepositoryImpl(ClientRepository clientJPARepository, ObjectMapper mapper) {
        this.clientJPARepository = clientJPARepository;
        this.mapper = mapper;
    }


    @Override
    public DomainClient getUserByUsername(String username) {
        return mapper.convertValue(clientJPARepository.findUserByUsername(username), DomainClient.class);
    }

    @Override
    public List<DomainClient> getAllUsers() {
        return clientJPARepository.findAll().stream().map(obj -> mapper.convertValue(obj, DomainClient.class)).toList();
    }

    @Override
    public void saveClient(DomainClient client) {
        clientJPARepository.save(mapper.convertValue(client, ClientEntity.class));
    }
}
