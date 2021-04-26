/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generic.crud.service.impl;

import com.generic.crud.exceptions.responses.HttpException;
import java.io.Serializable;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 *
 * @author jhonfre
 */
@Component
public class GenericGrudImpl<T, ID> {

    private JpaRepository<T, ID> repository;

    public GenericGrudImpl(JpaRepository<T, ID> repository) {
        this.repository = repository;
    }

    public T save(T entity) {
        T result = null;
        try {
            result = repository.save(entity);
            if (result == null) {
                throw new HttpException(500, "url fail", "Ocurrio un error al guardar el dato en la base de datos");
            }
        } catch (Exception e) {
            throw new HttpException(500, "url fail", e.getMessage());
        }
        return result;
    }

    public void deleteById(ID id) {
        try {
            repository.deleteById(id);
        } catch (Exception e) {
            throw new HttpException(500, "url fail", e.getMessage());
        }
    }

    public Optional<T> findById(ID id) {
        Optional<T> result = null;
        try {
            result = repository.findById(id);
            if (!result.isPresent()) {
                throw new HttpException(404, "url fail", "No se encontro el dato en la base de datos");
            }
        } catch (Exception e) {
            throw new HttpException(404, "url fail", e.getMessage());
        }
        return result;
    }

    public List<T> findAll() {
        List<T> result = null;
        try {
            result = repository.findAll();
            if (result.isEmpty()) {
                throw new HttpException(404, "url fail", "No hay datos en la base de datos");
            }
        } catch (Exception e) {
            throw new HttpException(404, "url fail", e.getMessage());
        }
        return result;
    }

}
