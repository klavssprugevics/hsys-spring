package com.sprugevics.hsys.person.doctor;

import com.sprugevics.hsys.person.Address;
import com.sprugevics.hsys.person.Person;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table
public class Doctor extends Person {
    private String specialization;
    private String department;

    public Doctor() {
    }

    public Doctor(String firstName, String lastName, String phone, String email, LocalDate dateOfBirth, Address homeAddress, String specialization, String department) {
        super(firstName, lastName, phone, email, dateOfBirth, homeAddress);
        this.specialization = specialization;
        this.department = department;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
