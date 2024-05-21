package com.al2.demo.infrastructure.api.port;

import com.al2.demo.infrastructure.api.adapters.ClientDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface ClientsAPIPort {
    @GetMapping(path = "/")
    @ResponseBody ResponseEntity<List<ClientDTO>> getAllUsers();


    @GetMapping(path = "/{username}")
    @ResponseBody ResponseEntity<ClientDTO> getUserByUsername(@PathVariable String username);

    @PostMapping(path = "/")
    @ResponseBody ResponseEntity<ClientDTO> createUser(@RequestBody ClientDTO user);
}
