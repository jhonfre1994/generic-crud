/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generic.crud.utils;

import java.util.ArrayList;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author jhonfre
 */
public class ParseData<E, T> {
    
    private ModelMapper mapper;

    public ParseData(ModelMapper mapper) {
        this.mapper = mapper;
    }
    
    public List<T> parseEntityToDto(List<E> listEntity, Class<T> contentClass) {
        List<T> result = new ArrayList<T>();
        for (E t : listEntity) {
            result.add(mapper.map(t, contentClass));
        }
        return result;
    }

}
