package com.github.nhegde.password.bean.constraints.validator;

import com.github.nhegde.password.util.PasswordValidators;

/**
 * Nagaraj Hegde.
 */
public class ContainLowercaseValidator {

    public static boolean isValid(String password) {
        return PasswordValidators.containLowercase(password);
    }

}
