package com.sprugevics.hsys.person;


import javax.persistence.*;
import java.time.LocalDate;

@MappedSuperclass
public class Person {

    @Id
    @GeneratedValue(generator="increment")
    private long personId;

    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private LocalDate dateOfBirth;

    @Embedded
    private Address homeAddress;

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Person() {
    }

    public Person(String firstName, String lastName, String phone, String email, LocalDate dateOfBirth, Address homeAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.homeAddress = homeAddress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "PersonId=" + personId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", homeAddress=" + homeAddress.toString() +
                '}';
    }
}
