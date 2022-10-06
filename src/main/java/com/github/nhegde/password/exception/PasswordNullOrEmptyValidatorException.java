package com.github.nhegde.password.exception;

public class PasswordNullOrEmptyValidatorException extends PasswordValidatorException {

    public PasswordNullOrEmptyValidatorException() {
    }

    public PasswordNullOrEmptyValidatorException(String message) {
        super(message);
    }

    public PasswordNullOrEmptyValidatorException(String message, Throwable cause) {
        super(message, cause);
    }

    public PasswordNullOrEmptyValidatorException(Throwable cause) {
        super(cause);
    }
}
