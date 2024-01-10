package com.paperless.persistence.entities;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;


@Slf4j
class AuthUserValidationTests {
    ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
    Validator validator = factory.getValidator();

    @Test
    @DisplayName("Validate with valid username, first name, last name, password and email")
    void allValid() {
        // Arrange
        AuthUser authUser = new AuthUser();
        authUser.setUsername("username");
        authUser.setFirstName("first");
        authUser.setLastName("last");
        authUser.setPassword("ValidPwd1#");
        authUser.setEmail("example@test.com");

        // Act
        var violations = validator.validate(authUser);

        // Assert
        assert violations.isEmpty();
    }

    @Test
    @DisplayName("Validate with invalid username")
    void usernameInvalid() {
        // Arrange
        AuthUser authUser = new AuthUser();
        authUser.setUsername("u");
        authUser.setFirstName("first");
        authUser.setLastName("last");
        authUser.setPassword("ValidPwd1#");
        authUser.setEmail("example@test.com");

        // Act
        var violations = validator.validate(authUser);

        for (var violation : violations)
        {
            log.error(violation.getMessage());
        }

        // Assert
        assert !violations.isEmpty();
    }

    @Test
    @DisplayName("Validate with invalid password")
    void passwordInvalid() {
        // Arrange
        AuthUser authUser = new AuthUser();
        authUser.setUsername("username");
        authUser.setFirstName("first");
        authUser.setLastName("last");
        authUser.setPassword("InvalidPwd");
        authUser.setEmail("example@test.com");

        // Act
        var violations = validator.validate(authUser);

        for (var violation : violations)
        {
            log.error(violation.getMessage());
        }

        // Assert
        assert !violations.isEmpty();
    }

    @Test
    @DisplayName("Validate with invalid first name")
    void firstNameInvalid() {
        // Arrange
        AuthUser authUser = new AuthUser();
        authUser.setUsername("username");
        authUser.setFirstName("f");
        authUser.setLastName("last");
        authUser.setPassword("ValidPwd1#");
        authUser.setEmail("example@test.com");

        // Act
        var violations = validator.validate(authUser);

        for (var violation : violations)
        {
            log.error(violation.getMessage());
        }

        // Assert
        assert !violations.isEmpty();
    }

    @Test
    @DisplayName("Validate with invalid last name")
    void lastNameInvalid() {
        // Arrange
        AuthUser authUser = new AuthUser();
        authUser.setUsername("username");
        authUser.setFirstName("first");
        authUser.setLastName("l");
        authUser.setPassword("ValidPwd1#");
        authUser.setEmail("example@test.com");

        // Act
        var violations = validator.validate(authUser);

        for (var violation : violations)
        {
            log.error(violation.getMessage());
        }

        // Assert
        assert !violations.isEmpty();
    }

    @Test
    @DisplayName("Validate with invalid email")
    void emailInvalid() {
        // Arrange
        AuthUser authUser = new AuthUser();
        authUser.setUsername("username");
        authUser.setFirstName("first");
        authUser.setLastName("last");
        authUser.setPassword("ValidPwd1#");
        authUser.setEmail("exampletest.com");

        // Act
        var violations = validator.validate(authUser);

        for (var violation : violations)
        {
            log.error(violation.getMessage());
        }

        // Assert
        assert !violations.isEmpty();
    }
}