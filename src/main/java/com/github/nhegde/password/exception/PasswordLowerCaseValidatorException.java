package com.github.nhegde.password.exception;

public class PasswordLowerCaseValidatorException extends PasswordValidatorException {

    public PasswordLowerCaseValidatorException() {
    }

    public PasswordLowerCaseValidatorException(String message) {
        super(message);
    }

    public PasswordLowerCaseValidatorException(String message, Throwable cause) {
        super(message, cause);
    }

    public PasswordLowerCaseValidatorException(Throwable cause) {
        super(cause);
    }
}
