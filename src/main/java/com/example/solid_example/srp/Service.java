package com.example.solid_example.srp;

public class Service {
    private final Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public Idea getById(String id) {
        return repository.getById(id);
    }
}
