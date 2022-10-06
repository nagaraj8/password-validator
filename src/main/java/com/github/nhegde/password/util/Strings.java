package com.github.nhegde.password.util;

import com.github.nhegde.password.exception.PasswordValidatorException;

import java.util.Objects;
import java.util.logging.Logger;

public class Strings {

    private static final Logger logger = Logger.getLogger("Strings.java");
    public static final String BLANK = "";

    public static boolean isBlank(String string) throws PasswordValidatorException {
        if(string == null || Objects.equals(string.trim(), BLANK)) {
            logger.warning("Password cannot be null or Empty!");
            throw new PasswordValidatorException("Password cannot be null or Empty!");
        }
        return false;
    }

}
