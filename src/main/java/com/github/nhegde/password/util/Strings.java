package com.github.nhegde.password.util;

import com.github.nhegde.password.exception.PasswordValidatorException;

import java.util.Objects;

public class Strings {

    public static final String BLANK = "";

    public static boolean isBlank(String string) throws PasswordValidatorException {
        if(string == null || Objects.equals(string.trim(), BLANK)) {
            throw new PasswordValidatorException("Password cannot be null or Empty!");
        }
        return false;
    }

}
