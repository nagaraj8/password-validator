package com.github.nhegde.password.bean.constraints.validator;

import com.github.nhegde.password.exception.PasswordValidatorException;
import com.github.nhegde.password.util.PasswordValidators;

/**
 * Nagaraj Hegde.
 */
public class ContainEightCharsValidator {

    public static boolean isValid(String password) throws PasswordValidatorException {
        return PasswordValidators.containsEightCharsAtLeast(password);
    }
}
