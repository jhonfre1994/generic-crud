/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  jhonfre
 * Created: 23/04/2021
 */

CREATE TABLE person (
    id serial,
    nombres VARCHAR,
    apellidos varchar,
  PRIMARY KEY (id)
);

CREATE TABLE mascot(
    id serial,
    raza VARCHAR,
    color varchar,
  PRIMARY KEY (id)
)


