package com.joker.demo.Inpirational.Demo.rest;

import com.joker.demo.Inpirational.Demo.entity.Image;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ImageRestExceptionHandler {

    // add exception handling code here

    @ExceptionHandler
    public ResponseEntity<ImageErrorResponse> handleException(ImageNotFoundException exc) {

        // create a StudentErrorResponse

        ImageErrorResponse error = new ImageErrorResponse();

        error.setStatus(HttpStatus.NOT_FOUND.value());
        error.setMessage(exc.getMessage());
        error.setSuccess(true);
        error.setData(new Image());

        // return ResponseEntity
        return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<ImageErrorResponse> handleException(Exception exc){
        // create a StudentErrorResponse

        ImageErrorResponse error = new ImageErrorResponse();

        error.setStatus(HttpStatus.BAD_REQUEST.value());
        error.setMessage(exc.getMessage());
        error.setSuccess(true);
        error.setData(new Image());

        // return ResponseEntity
        return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
    }
}
