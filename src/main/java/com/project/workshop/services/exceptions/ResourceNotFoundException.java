package com.project.workshop.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(Object id) {
        super("Service not found. Id " + id);
    }
}
