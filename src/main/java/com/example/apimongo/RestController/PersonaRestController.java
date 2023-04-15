package com.example.apimongo.RestController;

import com.example.apimongo.Document.Persona;
import com.example.apimongo.Service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/persona")
public class PersonaRestController {


    @Autowired
    PersonaService PersonaService;

    @GetMapping
    public List<Persona> findAll() {
        return PersonaService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Persona> findById(@PathVariable String id) {
        return PersonaService.findById(id);
    }

    @PostMapping
    public Persona add(@RequestBody Persona per) {
        return PersonaService.add(per);
    }


    @PutMapping
    public Persona update(@RequestBody Persona per) {
        return PersonaService.update(per);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        PersonaService.delete(id);
    }

}
