package com.chicos.ATGRegistration;
import com.chicos.ATGRegistration.CookiesList;
public class Response {

    private UserData userData;
    private String middlename;
    private String login;
    private String customernumber;
    private String brand;
    private String loyaltyDate;
    private String loyaltyFlag;
    private String loyaltyStatus;
    private String loyaltyTier;
    private String loyaltyTierDate;
    private String loyaltySpend;
    private String loyaltyDelta;
    private String loyaltyType;
    private String phoneRecordedMsgs;
    private String associateId;
    private String associateStatus;
    private String associateAgreement;
    private String mobileNumber;
    private String emailOptInPreference;
    private CookiesList cookiesList;

    public UserData getUserData() {
        return userData;
    }

    public void setUserData(UserData userData) {
        this.userData = userData;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getCustomernumber() {
        return customernumber;
    }

    public void setCustomernumber(String customernumber) {
        this.customernumber = customernumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLoyaltyDate() {
        return loyaltyDate;
    }

    public void setLoyaltyDate(String loyaltyDate) {
        this.loyaltyDate = loyaltyDate;
    }

    public String getLoyaltyFlag() {
        return loyaltyFlag;
    }

    public void setLoyaltyFlag(String loyaltyFlag) {
        this.loyaltyFlag = loyaltyFlag;
    }

    public String getLoyaltyStatus() {
        return loyaltyStatus;
    }

    public void setLoyaltyStatus(String loyaltyStatus) {
        this.loyaltyStatus = loyaltyStatus;
    }

    public String getLoyaltyTier() {
        return loyaltyTier;
    }

    public void setLoyaltyTier(String loyaltyTier) {
        this.loyaltyTier = loyaltyTier;
    }

    public String getLoyaltyTierDate() {
        return loyaltyTierDate;
    }

    public void setLoyaltyTierDate(String loyaltyTierDate) {
        this.loyaltyTierDate = loyaltyTierDate;
    }

    public String getLoyaltySpend() {
        return loyaltySpend;
    }

    public void setLoyaltySpend(String loyaltySpend) {
        this.loyaltySpend = loyaltySpend;
    }

    public String getLoyaltyDelta() {
        return loyaltyDelta;
    }

    public void setLoyaltyDelta(String loyaltyDelta) {
        this.loyaltyDelta = loyaltyDelta;
    }

    public String getLoyaltyType() {
        return loyaltyType;
    }

    public void setLoyaltyType(String loyaltyType) {
        this.loyaltyType = loyaltyType;
    }

    public String getPhoneRecordedMsgs() {
        return phoneRecordedMsgs;
    }

    public void setPhoneRecordedMsgs(String phoneRecordedMsgs) {
        this.phoneRecordedMsgs = phoneRecordedMsgs;
    }

    public String getAssociateId() {
        return associateId;
    }

    public void setAssociateId(String associateId) {
        this.associateId = associateId;
    }

    public String getAssociateStatus() {
        return associateStatus;
    }

    public void setAssociateStatus(String associateStatus) {
        this.associateStatus = associateStatus;
    }

    public String getAssociateAgreement() {
        return associateAgreement;
    }

    public void setAssociateAgreement(String associateAgreement) {
        this.associateAgreement = associateAgreement;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailOptInPreference() {
        return emailOptInPreference;
    }

    public void setEmailOptInPreference(String emailOptInPreference) {
        this.emailOptInPreference = emailOptInPreference;
    }

    public CookiesList getCookiesList() {
        return cookiesList;
    }

    public void setCookiesList(CookiesList cookiesList) {
        this.cookiesList = cookiesList;
    }

    public Response(UserData userData, String middlename, String login, String customernumber, String brand,
            String loyaltyDate, String loyaltyFlag, String loyaltyStatus, String loyaltyTier, String loyaltyTierDate,
            String loyaltySpend, String loyaltyDelta, String loyaltyType, String phoneRecordedMsgs, String associateId,
            String associateStatus, String associateAgreement, String mobileNumber, String emailOptInPreference,
            CookiesList cookiesList) {
        this.userData = userData;
        this.middlename = middlename;
        this.login = login;
        this.customernumber = customernumber;
        this.brand = brand;
        this.loyaltyDate = loyaltyDate;
        this.loyaltyFlag = loyaltyFlag;
        this.loyaltyStatus = loyaltyStatus;
        this.loyaltyTier = loyaltyTier;
        this.loyaltyTierDate = loyaltyTierDate;
        this.loyaltySpend = loyaltySpend;
        this.loyaltyDelta = loyaltyDelta;
        this.loyaltyType = loyaltyType;
        this.phoneRecordedMsgs = phoneRecordedMsgs;
        this.associateId = associateId;
        this.associateStatus = associateStatus;
        this.associateAgreement = associateAgreement;
        this.mobileNumber = mobileNumber;
        this.emailOptInPreference = emailOptInPreference;
        this.cookiesList = cookiesList;
    }

    @Override
    public String toString() {
        return "Response [associateAgreement=" + associateAgreement + ", associateId=" + associateId
                + ", associateStatus=" + associateStatus + ", brand=" + brand + ", cookiesList=" + cookiesList
                + ", customernumber=" + customernumber + ", emailOptInPreference=" + emailOptInPreference + ", login="
                + login + ", loyaltyDate=" + loyaltyDate + ", loyaltyDelta=" + loyaltyDelta + ", loyaltyFlag="
                + loyaltyFlag + ", loyaltySpend=" + loyaltySpend + ", loyaltyStatus=" + loyaltyStatus + ", loyaltyTier="
                + loyaltyTier + ", loyaltyTierDate=" + loyaltyTierDate + ", loyaltyType=" + loyaltyType
                + ", middlename=" + middlename + ", mobileNumber=" + mobileNumber + ", phoneRecordedMsgs="
                + phoneRecordedMsgs + ", userData=" + userData + "]";
    }

    
}
