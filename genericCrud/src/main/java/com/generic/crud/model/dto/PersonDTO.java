/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generic.crud.model.dto;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author jhonfre
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonDTO implements Serializable {

    private Integer id;
    private String nombres;
    private String apellidos;

}
