/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generic.crud.controller;

import com.generic.crud.entity.PersonEntity;
import com.generic.crud.model.dto.MascotDTO;
import com.generic.crud.model.dto.PersonDTO;
import com.generic.crud.service.MascotService;
import com.generic.crud.service.impl.PersonServiceImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jhonfre
 */
@RestController
@RequestMapping("/api/v.1/mascot")
public class MascotController {

    @Autowired
    private MascotService impl;

    @PostMapping()
    public ResponseEntity<?> getMascto(@RequestBody MascotDTO p) {
        MascotDTO res = impl.saveMascot(p);
        return ResponseEntity.ok(res);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteMascto(@PathVariable("id") Integer id) {
        impl.delete(id);
        return ResponseEntity.ok("Se elimino correctamente");
    }

    @GetMapping("")
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok(impl.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(impl.findById(id));
    }
}
