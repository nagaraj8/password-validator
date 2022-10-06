package com.github.nhegde.password.exception;

public class PasswordEightCharsValidatorException extends PasswordValidatorException {

    public PasswordEightCharsValidatorException() {
    }

    public PasswordEightCharsValidatorException(String message) {
        super(message);
    }

    public PasswordEightCharsValidatorException(String message, Throwable cause) {
        super(message, cause);
    }

    public PasswordEightCharsValidatorException(Throwable cause) {
        super(cause);
    }
}
