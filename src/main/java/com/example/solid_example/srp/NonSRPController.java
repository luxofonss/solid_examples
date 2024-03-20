package com.example.solid_example.srp;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

@Controller
public class NonSRPController {
//    private final JpaIdeaRepository jpaIdeaRepository;
    public ResponseEntity<?> getUserById() {

        // Idea idea = jpaIdeaRepository.findById(id).orElseThrow(() -> new NotFoundException("Idea not found"));
        // check permission of requester

        return ResponseEntity.ok().build();
    }
}
