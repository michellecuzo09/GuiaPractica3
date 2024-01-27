/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.practica.ProyectoSpringMongo.Repository;

import com.practica.ProyectoSpringMongo.Model.Persona;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author miche
 */

public interface PersonaRepository extends MongoRepository<Persona, Long> {

}
