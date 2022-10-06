package com.github.nhegde.password.feature;

import com.github.nhegde.password.bean.constraints.validator.ContainDigitValidator;
import com.github.nhegde.password.bean.constraints.validator.ContainEightCharsValidator;
import com.github.nhegde.password.bean.constraints.validator.ContainLowercaseValidator;
import com.github.nhegde.password.bean.constraints.validator.ContainUppercaseValidator;

public class PasswordFeature {

    public boolean checkFeatureOne(String password) {
        boolean containsEightChars = ContainEightCharsValidator.isValid(password);
        boolean containsOneUpperLetterAtLeast = ContainUppercaseValidator.isValid(password);
        boolean containsLowerCaseChars = ContainLowercaseValidator.isValid(password);
        boolean containsDigits = ContainDigitValidator.isValid(password);

        if((containsEightChars && containsOneUpperLetterAtLeast)
                || (containsOneUpperLetterAtLeast && containsLowerCaseChars)
                || ((containsOneUpperLetterAtLeast && containsLowerCaseChars && containsDigits))) {
            return true;
        }
        return false;
    }

    public boolean checkFeatureTwo(String password) {
        return ContainLowercaseValidator.isValid(password);
    }

    public boolean checkFeature(String password) {
        if(checkFeatureTwo(password)) {
            return checkFeatureOne(password);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new PasswordFeature().checkFeature("SHANTa"));
    }

}
