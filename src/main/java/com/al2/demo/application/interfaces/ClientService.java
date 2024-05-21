package com.al2.demo.application.interfaces;

import com.al2.demo.infrastructure.api.adapters.ClientDTO;

import java.util.List;

public interface ClientService {
    List<ClientDTO> getAllUsers();

    ClientDTO getUserByUsername(String username);

    ClientDTO createUser(ClientDTO clientDTO);
}
