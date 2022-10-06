package com.github.nhegde.password.exception;

public class PasswordUpperCaseValidatorException extends PasswordValidatorException {

    public PasswordUpperCaseValidatorException() {
    }

    public PasswordUpperCaseValidatorException(String message) {
        super(message);
    }

    public PasswordUpperCaseValidatorException(String message, Throwable cause) {
        super(message, cause);
    }

    public PasswordUpperCaseValidatorException(Throwable cause) {
        super(cause);
    }
}
