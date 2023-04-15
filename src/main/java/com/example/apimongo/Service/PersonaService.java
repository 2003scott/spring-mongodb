package com.example.apimongo.Service;

import com.example.apimongo.Document.Persona;

import java.util.List;
import java.util.Optional;

public interface PersonaService {

    List<Persona> findAll();
    Optional<Persona> findById(String id);
    Persona add(Persona per);
    Persona update(Persona per);
    public void delete(String id);
}
