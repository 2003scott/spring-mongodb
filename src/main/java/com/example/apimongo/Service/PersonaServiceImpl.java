package com.example.apimongo.Service;

import com.example.apimongo.Document.Persona;
import com.example.apimongo.Repository.PersonaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    PersonaRepository personaRepository;

    @Override
    public List<Persona> findAll() {
        return personaRepository.findAll();
    }

    @Override
    public Optional<Persona> findById(String id) {
        return personaRepository.findById(id);
    }

    @Override
    public Persona add(Persona per) {
        return personaRepository.save(per);
    }


    @Override
    public Persona update(Persona per) {
        return personaRepository.save(per);
    }

    @Override
    public void delete(String id) {
        personaRepository.deleteById(id);
    }
}
