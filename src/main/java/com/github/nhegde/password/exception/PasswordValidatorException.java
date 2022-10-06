package com.github.nhegde.password.exception;

public class PasswordValidatorException extends Exception {

    public PasswordValidatorException() {
    }

    public PasswordValidatorException(String message) {
        super(message);
    }

    public PasswordValidatorException(String message, Throwable cause) {
        super(message, cause);
    }

    public PasswordValidatorException(Throwable cause) {
        super(cause);
    }
}
