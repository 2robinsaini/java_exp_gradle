package com.robin.school.config;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.net.http.HttpResponse;
import java.sql.SQLException;

@ControllerAdvice
@Component
public class ExceptionHandling extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = {Exception.class,SQLException.class})
    public ResponseEntity<String> handleException(RuntimeException exception){
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.BAD_REQUEST) ;
    }

}
