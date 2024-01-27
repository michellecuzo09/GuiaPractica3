/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica.ProyectoSpringMongo.Model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;
import org.springframework.data.annotation.Id;
/**
 *
 * @author miche
 */

@Document(collection = "Persona")
@Data
public class Persona {
    @Id
    private Long id;
    private String nombre;
    private String apellido;
    private String direccion;
    private Contactos contactos;
    private List<Telefonia> listTelefonia;
    
}