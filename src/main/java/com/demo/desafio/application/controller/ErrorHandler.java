package com.demo.desafio.application.controller;

import static org.springframework.http.ResponseEntity.status;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestControllerAdvice
@AllArgsConstructor
public class ErrorHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity unknownError(Exception ex) {
        log.error(ex.getMessage(), ex);
        return status(HttpStatus.INTERNAL_SERVER_ERROR).body(createErrorMap(ex.getMessage()));
    }

    private static Map createErrorMap(String message) {
        Map map = new HashMap();
        map.put("error", message);
        return map;
    }
}
