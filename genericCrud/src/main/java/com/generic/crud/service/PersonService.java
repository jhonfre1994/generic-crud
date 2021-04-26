/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generic.crud.service;

import com.generic.crud.model.dto.PersonDTO;
import java.util.List;

/**
 *
 * @author jhonfre
 */
public interface PersonService {

    PersonDTO savePerson(PersonDTO p);
    
    void delete(Integer id);
    
    PersonDTO findById(Integer id);
    
    PersonDTO findByName(String name);
    
    List<PersonDTO> findAll();
}
