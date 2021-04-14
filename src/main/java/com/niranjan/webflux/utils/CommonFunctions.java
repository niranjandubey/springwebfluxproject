package com.niranjan.webflux.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class CommonFunctions {

    public ResponseEntity getSuccessMessage(String message) {
        return new ResponseEntity(message, HttpStatus.OK);
    }

    public ResponseEntity getErrorMessage(String message) {
        return new ResponseEntity(message, HttpStatus.BAD_REQUEST);
    }
}
