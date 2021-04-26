/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generic.crud.service.impl;

import com.generic.crud.entity.PersonEntity;
import com.generic.crud.interfaces.PersonRepository;
import com.generic.crud.model.dto.PersonDTO;
import com.generic.crud.service.PersonService;
import com.generic.crud.utils.ParseData;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author jhonfre
 */
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private GenericGrudImpl<PersonEntity, Integer> crudRepository;

    @Autowired
    private PersonRepository personRepository1;

    @Autowired
    private ModelMapper mapper;
    

    @Override
    public PersonDTO savePerson(PersonDTO p) {
        PersonEntity entitySave = crudRepository.save(mapper.map(p, PersonEntity.class));
        return mapper.map(entitySave, PersonDTO.class);
    }

    @Override
    public void delete(Integer id) {
        crudRepository.deleteById(id);
    }

    @Override
    public PersonDTO findById(Integer id) {
        return mapper.map(crudRepository.findById(id).get(), PersonDTO.class);
    }

    @Override
    public PersonDTO findByName(String name) {
        return mapper.map(personRepository1.findByNombres(name), PersonDTO.class);
    }

    @Override
    public List<PersonDTO> findAll() {
        ParseData<PersonEntity, PersonDTO> parseDataList = new ParseData<>(mapper);
        List<PersonEntity> list = crudRepository.findAll();
        return parseDataList.parseEntityToDto(list, PersonDTO.class);
    }

}
