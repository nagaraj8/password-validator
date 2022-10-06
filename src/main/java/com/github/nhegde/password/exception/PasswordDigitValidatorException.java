package com.github.nhegde.password.exception;

public class PasswordDigitValidatorException extends PasswordValidatorException {

    public PasswordDigitValidatorException() {
    }

    public PasswordDigitValidatorException(String message) {
        super(message);
    }

    public PasswordDigitValidatorException(String message, Throwable cause) {
        super(message, cause);
    }

    public PasswordDigitValidatorException(Throwable cause) {
        super(cause);
    }
}
