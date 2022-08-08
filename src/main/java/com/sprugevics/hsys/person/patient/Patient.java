package com.sprugevics.hsys.person.patient;


import com.sprugevics.hsys.person.Address;
import com.sprugevics.hsys.person.Person;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Patient extends Person {

    private Gender gender;

    public Patient() {
    }

    public Patient(String firstName, String lastName, String phone, String email, LocalDate dateOfBirth, Address homeAddress, Gender gender) {
        super(firstName, lastName, phone, email, dateOfBirth, homeAddress);
        this.gender = gender;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
