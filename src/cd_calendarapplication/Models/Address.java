/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cd_calendarapplication.Models;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author caseydierking
 */
public class Address {
    
    private SimpleIntegerProperty addressId;
    private SimpleStringProperty address;
    private SimpleStringProperty address2;
    private SimpleIntegerProperty cityId;
    private SimpleStringProperty postalCode;
    private SimpleStringProperty phone;

    public Address(Integer addressId, String address, String address2, Integer cityId, String postalCode, String phone) {
        this.addressId = new SimpleIntegerProperty(addressId);
        this.address = new SimpleStringProperty(address);
        this.address2 = new SimpleStringProperty(address2);
        this.cityId = new SimpleIntegerProperty(cityId);
        this.postalCode = new SimpleStringProperty(postalCode);
        this.phone = new SimpleStringProperty(phone);
    }

    public Integer getAddressId() {
        return addressId.get();
    }

    public void setAddressId(SimpleIntegerProperty addressId) {
        this.addressId = addressId;
    }

    public String getAddress() {
        return address.get();
    }

    public void setAddress(SimpleStringProperty address) {
        this.address = address;
    }

    public String getAddress2() {
        return address2.get();
    }

    public void setAddress2(SimpleStringProperty address2) {
        this.address2 = address2;
    }

    public Integer getCityId() {
        return cityId.get();
    }

    public void setCityId(SimpleIntegerProperty cityId) {
        this.cityId = cityId;
    }

    public String getPostalCode() {
        return postalCode.get();
    }

    public void setPostalCode(SimpleStringProperty postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhone() {
        return phone.get();
    }

    public void setPhone(SimpleStringProperty phone) {
        this.phone = phone;
    }
    
    
    
    
    
    
    
    
    
    
}


