package com.generic.crud.exceptions;

import com.generic.crud.exceptions.responses.HttpException;
import com.generic.crud.model.ErrorModel;
import com.generic.crud.model.ExceptionResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@RestController
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(HttpException.class)
    public final ResponseEntity<ExceptionResponse> handleBadRequestException(HttpException ex, WebRequest request) {
        HttpStatus status = HttpStatus.valueOf(ex.getStatus());
        ExceptionResponse exceptionResponse = new ExceptionResponse(new ErrorModel(status.getReasonPhrase(), ex.getStatus(), ex.getUrlFail(), ex.getDetail()));
        return new ResponseEntity<>(exceptionResponse, status);
    }
}
