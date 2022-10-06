package com.github.nhegde.password.util;

import com.github.nhegde.password.exception.*;
import com.github.nhegde.password.util.Strings;
import org.passay.*;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Objects;
import java.util.logging.Logger;

public class PasswordValidators {

    private static final Logger logger = Logger.getLogger("PasswordValidators.java");

    public static boolean containDigit(String password) throws PasswordValidatorException {
        boolean isContainDigit =  contain(password, EnglishCharacterData.Digit);
        if(!isContainDigit) {
            logger.warning("Password should contain at least one digit!");
            throw new PasswordDigitValidatorException("Password should contain at least one digit!");
        }
        return true;
    }

    public static boolean containUppercase(String password) throws PasswordValidatorException {
        boolean containUpperCase =  contain(password, EnglishCharacterData.UpperCase);
        if(!containUpperCase) {
            logger.warning("Password should contain at least one uppercase character!");
            throw new PasswordUpperCaseValidatorException("Password should contain at least one uppercase character!");
        }

        return true;
    }

    public static boolean containLowercase(String password) throws PasswordValidatorException {
        boolean containLowerCase =  contain(password,EnglishCharacterData.LowerCase);
        if(!containLowerCase) {
            logger.warning("Password should contain at least one lowercase character!");
            throw new PasswordLowerCaseValidatorException("Password should contain at least one lowercase character!");
        }
        return true;
    }

    private static boolean contain(String password, EnglishCharacterData rule) throws PasswordValidatorException {
        Strings.isBlank(password);
        return new PasswordValidator(Collections.singletonList(new CharacterRule(rule))).validate(new PasswordData(password)).isValid();
    }

    public static boolean notContainWhiteSpace(String password) throws PasswordValidatorException {
        Strings.isBlank(password);
        return new PasswordValidator(Collections.singletonList(new WhitespaceRule())).validate(new PasswordData(password)).isValid();
    }

    public static boolean containsEightCharsAtLeast(String password) throws PasswordValidatorException {
        Strings.isBlank(password);
        boolean isEightChars = new PasswordValidator(Collections.singletonList(new LengthRule(8, 30))).validate(new PasswordData(password)).isValid();
        if(!isEightChars) {
            logger.warning("Password Should be at least 8 characters in length!");
            throw new PasswordEightCharsValidatorException("Password Should be at least 8 characters in length!");
        }
        return true;
    }

}
