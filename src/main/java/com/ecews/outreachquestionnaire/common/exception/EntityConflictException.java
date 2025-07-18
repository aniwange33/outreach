package com.ecews.outreachquestionnaire.common.exception;

public class EntityConflictException extends RuntimeException {
    public EntityConflictException(String entityName) {
        super(entityName + " was modified by another user. Please refresh.");
    }
}