package com.example.solid_example.srp;

import org.springframework.http.ResponseEntity;

public class Controller {
    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    public ResponseEntity<?> getUserById(String id) {

        Idea idea = service.getById(id);

        return ResponseEntity.ok().body(idea);
    }
}
