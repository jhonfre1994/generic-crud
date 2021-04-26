package com.generic.crud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ErrorModel {

    private String title;
    private int status;
    private String apiFail;
    private String detail;

}
