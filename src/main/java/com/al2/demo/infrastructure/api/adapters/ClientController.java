package com.al2.demo.infrastructure.api.adapters;

import com.al2.demo.infrastructure.api.port.ClientsAPIPort;
import com.al2.demo.application.services.ClientServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class ClientController implements ClientsAPIPort {

    private static final Logger log = LoggerFactory.getLogger(ClientController.class);
    private final ClientServiceImpl clientServiceImpl;

    public ClientController(ClientServiceImpl clientServiceImpl) {
        this.clientServiceImpl = clientServiceImpl;
    }

    @GetMapping(path = "/")
    public @ResponseBody ResponseEntity<List<ClientDTO>> getAllUsers(){
        try {
            return ResponseEntity.ok(clientServiceImpl.getAllUsers());
        }catch (Exception e){
            log.error("Error obtaining all users", e);
            return ResponseEntity.badRequest().build();
        }
    }


    @GetMapping(path = "/{username}")
    public @ResponseBody ResponseEntity<ClientDTO> getUserByUsername(@PathVariable String username){
        try {
            return ResponseEntity.ok(clientServiceImpl.getUserByUsername(username));
        }catch (Exception e){
            log.error("Error obtaining user by username", e);
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping(path = "/")
    public @ResponseBody ResponseEntity<ClientDTO> createUser(@RequestBody ClientDTO user){
        try {
            return ResponseEntity.ok(clientServiceImpl.createUser(user));
        }catch (Exception e){
            log.error("Error creating user", e);
            return ResponseEntity.badRequest().build();
        }

    }
}
