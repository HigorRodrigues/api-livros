package com.higor.socialbooks.socialbooks.handler;

import com.higor.socialbooks.socialbooks.services.exceptions.LivroNotFoundException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResourceExceptionHandler {
    
    @ExceptionHandler(LivroNotFoundException.class)
    public ResponseEntity<Void> handleLivroNãoEncontradoException(LivroNotFoundException e, HttpServletRequest request){
        return ResponseEntity.notFound().build();
    }
}
