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
public class Customer {

    private SimpleIntegerProperty customerId;
    private SimpleStringProperty customerName;
    private SimpleIntegerProperty active;
    private SimpleIntegerProperty addressId;

    public Customer(Integer customerId, String customerName, Integer addressId, Integer active) {
        this.customerId = new SimpleIntegerProperty(customerId);
        this.customerName = new SimpleStringProperty(customerName);
        this.active = new SimpleIntegerProperty(active);
        this.addressId = new SimpleIntegerProperty(addressId);
    }

    /**
     * @return the customerId
     */
    public Integer getCustomerId() {
        return customerId.get();
    }

    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(SimpleIntegerProperty customerId) {
        this.customerId = customerId;
    }

    /**
     * @return the customerName
     */
    public String getCustomerName() {
        return customerName.get();
    }

    /**
     * @param customerName the customerName to set
     */
    public void setCustomerName(SimpleStringProperty customerName) {
        this.customerName = customerName;
    }

    /**
     * @return the active
     */
    public Integer getActive() {
        return active.get();
    }

    /**
     * @param active the active to set
     */
    public void setActive(SimpleIntegerProperty active) {
        this.active = active;
    }

    /**
     * @return the addressId
     */
    public Integer getAddressId() {
        return addressId.get();
    }

    /**
     * @param addressId the addressId to set
     */
    public void setAddressId(SimpleIntegerProperty addressId) {
        this.addressId = addressId;
    }

}
