package com.al2.demo.application.services;

import com.al2.demo.domain.model.DomainClient;
import com.al2.demo.infrastructure.db.port.ClientEntityRepository;
import com.al2.demo.infrastructure.api.adapters.ClientDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl {

    private final ClientEntityRepository clientEntityRepository;
    private final ObjectMapper mapper;

    public ClientServiceImpl(ClientEntityRepository clientEntityRepository, ObjectMapper mapper) {
        this.clientEntityRepository = clientEntityRepository;
        this.mapper = mapper;
    }


    public List<ClientDTO> getAllUsers(){
        return clientEntityRepository.getAllUsers().stream().map(obj -> mapper.convertValue(obj, ClientDTO.class)).toList();
    }

    public ClientDTO getUserByUsername(String username){
        return mapper.convertValue(clientEntityRepository.getUserByUsername(username), ClientDTO.class);
    }

    public ClientDTO createUser(ClientDTO clientDTO) {
        clientEntityRepository.saveClient(mapper.convertValue(clientDTO, DomainClient.class));
        return clientDTO;
    }
}
