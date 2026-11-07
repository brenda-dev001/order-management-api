package com.project.ordermanagement.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(Object id) {
        super("Service not found. Id " + id);
    }
}
