/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generic.crud.service.impl;

import com.generic.crud.entity.Mascot;
import com.generic.crud.entity.PersonEntity;
import com.generic.crud.model.dto.MascotDTO;
import com.generic.crud.service.MascotService;
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
public class MasctoServiceImpl implements MascotService {

    @Autowired
    private GenericGrudImpl<Mascot, Integer> crudRepository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public MascotDTO saveMascot(MascotDTO p) {
        Mascot entitySave = crudRepository.save(mapper.map(p, Mascot.class));
        return mapper.map(entitySave, MascotDTO.class);
    }

    @Override
    public void delete(Integer id) {
        crudRepository.deleteById(id);
    }

    @Override
    public MascotDTO findById(Integer id) {
        return mapper.map(crudRepository.findById(id).get(), MascotDTO.class);
    }

    @Override
    public List<MascotDTO> findAll() {
        ParseData<Mascot, MascotDTO> parseDataList = new ParseData<>(mapper);
        List<Mascot> list = crudRepository.findAll();
        return parseDataList.parseEntityToDto(list, MascotDTO.class);
    }

}
