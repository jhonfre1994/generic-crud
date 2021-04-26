package com.generic.crud;

import com.generic.crud.entity.PersonEntity;
import com.generic.crud.service.impl.PersonServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class CrudApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(CrudApplication.class, args);
    }
    
}
