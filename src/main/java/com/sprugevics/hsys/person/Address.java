package com.sprugevics.hsys.person;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Embeddable
public class Address {

    private String country;
    private String city;
    private String postalCode;
    private String street;
    private String apartmentNumber;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(String apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public Address() {
    }

    public Address(String country, String city, String postalCode, String street) {
        this.country = country;
        this.city = city;
        this.postalCode = postalCode;
        this.street = street;
    }

    public Address(String country, String city, String postalCode, String street, String apartmentNumber) {
        this.country = country;
        this.city = city;
        this.postalCode = postalCode;
        this.street = street;
        this.apartmentNumber = apartmentNumber;
    }

    @Override
    public String toString() {
        return country + ", " + city + ", " + postalCode;
    }
}
