package com.example.SpringBoot_REST_.APIs;

import com.example.SpringBoot_REST_.APIs.model.student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class )
    public ResponseEntity<String>  ExceptionHandler(Exception e){
        return ResponseEntity.badRequest().body("Oops Something Went Wrong !");
    }


}
