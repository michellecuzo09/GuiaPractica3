/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica.ProyectoSpringMongo.Service;

import com.practica.ProyectoSpringMongo.Repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import com.practica.ProyectoSpringMongo.Model.Persona;

/**
 *
 * @author miche
 */
@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona, Long> implements PersonaService{
    @Autowired
    PersonaRepository personaRepository;
    @Override
    public CrudRepository<Persona,Long> getDao(){
        return personaRepository;
    }


    @Override
    public List<Persona> findByAll() {
        return null;
    }

}