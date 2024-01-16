package com.anupama.cerp.custom_exceptions;

@SuppressWarnings("serial")
public class EntityNotFoundException extends RuntimeException{
    public EntityNotFoundException(String message) {
        super(message);
    }
}
