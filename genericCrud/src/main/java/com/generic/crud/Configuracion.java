/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generic.crud;

import com.generic.crud.utils.ParseData;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author jhonfre
 */
@Configuration
public class Configuracion {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();

    }
    
}
