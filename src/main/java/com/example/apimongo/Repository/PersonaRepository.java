package com.example.apimongo.Repository;

import com.example.apimongo.Document.Persona;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonaRepository extends MongoRepository<Persona,String> {


}
