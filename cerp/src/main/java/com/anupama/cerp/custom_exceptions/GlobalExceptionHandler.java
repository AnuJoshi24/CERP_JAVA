//package com.anupama.cerp.custom_exceptions;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.context.request.WebRequest;
//
//@ControllerAdvice
//public class GlobalExceptionHandler {
//
//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<?> handleGlobalException(Exception exception , WebRequest webRequest){
//     return new ResponseEntity<>(exception.getMessage() + " , Exception class is " + exception.getClass() , HttpStatus.INTERNAL_SERVER_ERROR);
//    }
//}
