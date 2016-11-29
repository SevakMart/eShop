package action;

import dataaccess.dao.impl.CheckoutDAOImpl;
import dataaccess.dao.impl.CountryDAOImpl;
import model.Checkout;

/**
 * Created by forjava on 11/8/2016.
 */
public class CheckOutAction extends BaseAction {
    private String email;
    private String firstName;
    private String lastName;
    private String address;
    private String zipCode;
    private int countryId;
    private String region;
    private String phone;
    private String mobilePhone;
    private String message;

    @Override
    public String execute() throws Exception {
        Checkout checkout = new Checkout();
        CheckoutDAOImpl checkoutDAO = new CheckoutDAOImpl();
        CountryDAOImpl countryDAO = new CountryDAOImpl();
        checkout.setEmail(email);
        checkout.setFirstName(firstName);
        checkout.setLastName(lastName);
        checkout.setAddress(address);
        checkout.setZipCode(zipCode);
        checkout.setCountry(countryDAO.getEntityByID(countryId));
        checkout.setRegion(region);
        checkout.setPhone(phone);
        checkout.setMobilePhone(mobilePhone);
        checkout.setMessage(message);
        checkoutDAO.create(checkout);
        return SUCCESS;
    }

    public String view() {
        return SUCCESS;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
