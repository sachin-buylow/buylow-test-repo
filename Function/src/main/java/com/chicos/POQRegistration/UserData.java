package com.chicos.POQRegistration;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
public class UserData implements Serializable {

	/**
     *
     */
    private static final long serialVersionUID = 1L;
    @Email(message = "Email should be valid")
    private String email;
    @NotNull(message = "Password cannot be null")
    private String password;
    @NotNull(message = "First Name cannot be null")
    private String firstName;
    @NotNull(message = "Last Name cannot be null")
    private String lastName;
    private String allowContact;
    private String agreeTermsConditions;
    private POQCustomdata customData;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAllowContact() {
        return allowContact;
    }

    public void setAllowContact(String allowContact) {
        this.allowContact = allowContact;
    }

    public String getAgreeTermsConditions() {
        return agreeTermsConditions;
    }

    public void setAgreeTermsConditions(String agreeTermsConditions) {
        this.agreeTermsConditions = agreeTermsConditions;
    }

    public POQCustomdata getCustomData() {
        return customData;
    }

    public void setCustomData(POQCustomdata customData) {
        this.customData = customData;
    }

    public UserData(@Email(message = "Email should be valid") String email,
            @NotNull(message = "Password cannot be null") String password,
            @NotNull(message = "First Name cannot be null") String firstName,
            @NotNull(message = "Last Name cannot be null") String lastName, String allowContact,
            String agreeTermsConditions, POQCustomdata customData) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.allowContact = allowContact;
        this.agreeTermsConditions = agreeTermsConditions;
        this.customData = customData;
    }

    @Override
    public String toString() {
        return "UserData [agreeTermsConditions=" + agreeTermsConditions + ", allowContact=" + allowContact
                + ", customData=" + customData + ", email=" + email + ", firstName=" + firstName + ", lastName="
                + lastName + ", password=" + password + "]";
    }

    
 
}