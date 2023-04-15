package com.example.apimongo.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(value = "Persona")
public class Persona {

    @Id
    private String id;

    private String nombres;

    private String apellidos;

    private String email;

    private Integer edad;
}
