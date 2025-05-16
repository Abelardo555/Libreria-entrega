package com.example.libreria.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class usuario {

    private int id_usuario;
    private String primer_nombre;
    private String primer_apellido;
    private int edad;
    private String email;

}
