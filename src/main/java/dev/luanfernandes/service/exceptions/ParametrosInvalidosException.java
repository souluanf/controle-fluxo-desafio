package dev.luanfernandes.service.exceptions;

import java.io.Serial;

public class ParametrosInvalidosException extends Exception{
    @Serial
    private static final long serialVersionUID = -3318375670154371568L;

    public ParametrosInvalidosException() {
    }

    public ParametrosInvalidosException(String message) {
        super(message);
    }
}
