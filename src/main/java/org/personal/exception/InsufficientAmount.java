package org.personal.exception;

public class InsufficientAmount extends RuntimeException {
    public InsufficientAmount(String ex) {
        super(ex);
    }
}
