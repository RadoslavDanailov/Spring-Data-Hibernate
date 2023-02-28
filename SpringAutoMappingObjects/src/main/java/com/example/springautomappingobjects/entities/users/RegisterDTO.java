package com.example.springautomappingobjects.entities.users;

import org.springframework.validation.annotation.Validated;

import javax.xml.bind.ValidationException;

@Validated
public class RegisterDTO {
    private String email;
    private String password;
    private String confirmPassword;
    private String fullName;

    /**
     *  commandParts[0] is skipped because it contains the command name
     *  which is not needed in the user object
     */
    public RegisterDTO(String[] commandParts) throws ValidationException {
        this.email = commandParts[1];
        this.password = commandParts[2];
        this.confirmPassword = commandParts[3];
        this.fullName = commandParts[4];

        this.validate();
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public String getFullName() {
        return fullName;
    }

    private void validate() throws ValidationException {
        int indexOfAt = email.indexOf("@");
        int indexOfDot = email.lastIndexOf(".");
        if (indexOfAt < 0 || indexOfDot < 0 || indexOfAt > indexOfDot) {
            throw new ValidationException("Email must contain @ and .");
        }

        // TODO: Validate password

        if (!password.equals(confirmPassword)) {
            throw new ValidationException("Password and confirm password must match!");
        }
    }
}
