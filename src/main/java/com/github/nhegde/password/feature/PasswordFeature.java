package com.github.nhegde.password.feature;

import com.github.nhegde.password.bean.constraints.validator.ContainDigitValidator;
import com.github.nhegde.password.bean.constraints.validator.ContainEightCharsValidator;
import com.github.nhegde.password.bean.constraints.validator.ContainLowercaseValidator;
import com.github.nhegde.password.bean.constraints.validator.ContainUppercaseValidator;
import com.github.nhegde.password.exception.PasswordValidatorException;

import java.util.logging.Logger;

public class PasswordFeature {

    private static final Logger logger = Logger.getLogger("PasswordFeature.java");

    public boolean checkFeatureOne(String password) throws PasswordValidatorException {
        logger.info("Verifying the feature one");
        boolean containsEightChars = ContainEightCharsValidator.isValid(password);
        boolean containsOneUpperLetterAtLeast = ContainUppercaseValidator.isValid(password);
        boolean containsLowerCaseChars = ContainLowercaseValidator.isValid(password);
        try {
            boolean containsDigits = ContainDigitValidator.isValid(password);
        }catch (PasswordValidatorException e) {
            logger.info("Password is verified successfully as previous three conditions are successful but the password doesn't contain any number!");
            return true;
        }

        if(containsEightChars && containsOneUpperLetterAtLeast || containsOneUpperLetterAtLeast && containsLowerCaseChars) {
            return true;
        }
        return false;
    }

    public boolean checkFeatureTwo(String password) throws PasswordValidatorException {
        logger.info("Verifying the feature two");
        return ContainLowercaseValidator.isValid(password);
    }

    public boolean checkFeature(String password) throws PasswordValidatorException {
        if(checkFeatureTwo(password)) {
            return checkFeatureOne(password);
        }
        return false;
    }

}
