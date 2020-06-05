package com.house_db.persistence.exceptions;

public class TypeNotFoundException extends RuntimeException {
    public TypeNotFoundException(String message) {
        super(message);
    }
}
