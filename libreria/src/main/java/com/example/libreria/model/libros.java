package com.example.libreria.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class libros {

    private int id;
    private String isbn;
    private String titulo;
    private String editorial;
    private int fechapublicacion;
    private String autor;

}
