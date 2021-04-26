package com.generic.crud.exceptions.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class HttpException extends RuntimeException {

    private int status;
    private String urlFail;
    private String detail;
}
