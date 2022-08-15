package com.sprugevics.hsys.person.doctor;

import com.sprugevics.hsys.person.Address;
import com.sprugevics.hsys.person.Person;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table
public class Doctor extends Person {

    private Department department;

    public Doctor() {
    }

    public Doctor(String firstName, String lastName, String phone, String email, LocalDate dateOfBirth, Address homeAddress, Department department) {
        super(firstName, lastName, phone, email, dateOfBirth, homeAddress);
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

}
