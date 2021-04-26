/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generic.crud.service;

import com.generic.crud.model.dto.MascotDTO;
import java.util.List;

/**
 *
 * @author jhonfre
 */
public interface MascotService {

    MascotDTO saveMascot(MascotDTO p);

    void delete(Integer id);

    MascotDTO findById(Integer id);

    List<MascotDTO> findAll();
}
