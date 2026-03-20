package com.example.bibliotecaduoc.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
//Data es una anotación de Lombok que genera automáticamente los métodos getters, setters, toString, equals y hashCode para la clase. Esto simplifica el código al evitar la necesidad de escribir manualmente estos métodos.
@NoArgsConstructor
@AllArgsConstructor

public class Libro {
    private int id;
    private String isbn;
    private String titulo;
    private String editorial;
    private String fechaPublicacion;
    private String autor;
}