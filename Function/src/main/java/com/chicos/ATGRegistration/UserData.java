package com.chicos.ATGRegistration;

public class UserData {

    
private String firstName;
private String lastName;
private String customerNumber;
private String phoneNumber;
private String email;
private String receiveMktEmail;
private String password;
private String confirmPassword;
private String birthMonth;
private String referralSource;
private UserAddress address;

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

public String getCustomerNumber() {
    return customerNumber;
}

public void setCustomerNumber(String customerNumber) {
    this.customerNumber = customerNumber;
}

public String getPhoneNumber() {
    return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getReceiveMktEmail() {
    return receiveMktEmail;
}

public void setReceiveMktEmail(String receiveMktEmail) {
    this.receiveMktEmail = receiveMktEmail;
}

public String getPassword() {
    return password;
}

public void setPassword(String password) {
    this.password = password;
}

public String getConfirmPassword() {
    return confirmPassword;
}

public void setConfirmPassword(String confirmPassword) {
    this.confirmPassword = confirmPassword;
}

public String getBirthMonth() {
    return birthMonth;
}

public void setBirthMonth(String birthMonth) {
    this.birthMonth = birthMonth;
}

public String getReferralSource() {
    return referralSource;
}

public void setReferralSource(String referralSource) {
    this.referralSource = referralSource;
}

public UserAddress getAddress() {
    return address;
}

public void setAddress(UserAddress address) {
    this.address = address;
}

public UserData(String firstName, String lastName, String customerNumber, String phoneNumber, String email,
        String receiveMktEmail, String password, String confirmPassword, String birthMonth, String referralSource,
        UserAddress address) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.customerNumber = customerNumber;
    this.phoneNumber = phoneNumber;
    this.email = email;
    this.receiveMktEmail = receiveMktEmail;
    this.password = password;
    this.confirmPassword = confirmPassword;
    this.birthMonth = birthMonth;
    this.referralSource = referralSource;
    this.address = address;
}

@Override
public String toString() {
    return "UserData [address=" + address + ", birthMonth=" + birthMonth + ", confirmPassword=" + confirmPassword
            + ", customerNumber=" + customerNumber + ", email=" + email + ", firstName=" + firstName + ", lastName="
            + lastName + ", password=" + password + ", phoneNumber=" + phoneNumber + ", receiveMktEmail="
            + receiveMktEmail + ", referralSource=" + referralSource + "]";
}





}
