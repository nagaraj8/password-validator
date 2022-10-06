package com.github.nhegde.password.util;

import com.github.nhegde.password.util.Strings;
import org.passay.*;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.Objects;

public class PasswordValidators {

    public static boolean containDigit(String password) {
        return contain(password, EnglishCharacterData.Digit);
    }

    public static boolean containUppercase(String password) {
        return contain(password, EnglishCharacterData.UpperCase);
    }

    public static boolean containLowercase(String password) {
        return contain(password,EnglishCharacterData.LowerCase);
    }

    public static boolean containSpecial(String password) {
        return contain(password, EnglishCharacterData.Special);
    }

    private static boolean contain(String password, EnglishCharacterData rule) {
        if (Strings.isBlank(password))
            return false;
        else
            return new PasswordValidator(Collections.singletonList(new CharacterRule(rule))).validate(new PasswordData(password)).isValid();
    }

    public static boolean notContainWhiteSpace(String password){
        if (Strings.isBlank(password))
            return false;
        else
            return new PasswordValidator(Collections.singletonList(new WhitespaceRule())).validate(new PasswordData(password)).isValid();
    }

    public static boolean containsEightCharsAtLeast(String password){
        if (Strings.isBlank(password))
            return false;
        else
            return new PasswordValidator(Collections.singletonList(new LengthRule(8, 30))).validate(new PasswordData(password)).isValid();
    }

}
