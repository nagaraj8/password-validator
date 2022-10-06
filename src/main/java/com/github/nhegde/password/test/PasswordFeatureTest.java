package com.github.nhegde.password.test;


import com.github.nhegde.password.exception.*;
import com.github.nhegde.password.feature.PasswordFeature;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PasswordFeatureTest {

    PasswordFeature passwordFeature = new PasswordFeature();

    @Test
    public void testFeatureWhenThereIsNoNumberAndPreviousThreeCasesPassed() throws PasswordValidatorException {
        boolean isValid = passwordFeature.checkFeature("Password");
        assertTrue(isValid);
    }

    @Test(expected = PasswordUpperCaseValidatorException.class)
    public void testFeatureWhenThereIsNoUpperCase() throws PasswordValidatorException {
        passwordFeature.checkFeature("password");
    }

    @Test(expected = PasswordLowerCaseValidatorException.class)
    public void testFeatureWhenThereIsNoLowerCase() throws PasswordValidatorException {
        passwordFeature.checkFeature("PASSWORD");
    }

    @Test(expected = PasswordEightCharsValidatorException.class)
    public void testFeatureWhenPasswordLengthIsLess() throws PasswordValidatorException {
        passwordFeature.checkFeature("passwrd");
    }

    @Test(expected = PasswordNullOrEmptyValidatorException.class)
    public void testFeatureWhenPasswordIsNull() throws PasswordValidatorException {
        passwordFeature.checkFeature(null);
    }

    @Test(expected = PasswordNullOrEmptyValidatorException.class)
    public void testFeatureWhenPasswordIsEmpty() throws PasswordValidatorException {
        passwordFeature.checkFeature("");
    }

    @Test
    public void testFeatureWhenPasswordIsValid() throws PasswordValidatorException {
        boolean isValid = passwordFeature.checkFeature("Password123");
        assertTrue(isValid);
    }

    //This is according to the given use case scenario where first three cases are passed
    // but the 1.d case lower case is not present. Hence the test case should throw an exception saying password is never OK.
    @Test(expected = PasswordLowerCaseValidatorException.class)
    public void testFeatureWhenPreviousThreePassedButLowerCaseIsNotPresent() throws PasswordValidatorException {
        passwordFeature.checkFeature("PASSWORD123");
    }



}