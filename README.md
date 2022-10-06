**Password Validation**

We like to build code for purposes of password verification. Verification will fail if any one
of the rules mentioned does not pass.
1. Implement the following rules. Each one of these will throw an exception with a
   different message of your choice
 - password should be larger than 8 chars
 - password should not be null
 - password should have one uppercase letter at least
 - password should have one lowercase letter at least
 - password should have one number at least
2. Add feature: Password is OK if at least three of the previous conditions is true
3. Add feature: password is never OK if item 1.d is not true.
4. Assume Each verification takes 1 second to complete. How would you solve items 2
   and 3 so tests can run faster?

**Solution**

Please follow the below steps to build and run the project. Currently this project is created with Java maven.
1. Clone/download the project into local.
2. Import the project to IDE or go to the project directory and build it using `mvn clean install`.
3. Once the project is built, Run the file PasswordFeatureTest.java which will test and cover most of the scenarios.
4. In case of anything needs to be tested specifically, please modify `testFeatureWhenPasswordIsValid` test case by giving the password of any type.

Improvements
-------------
Design of the project can be handled in a many better different other ways.
