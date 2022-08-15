package com.sprugevics.hsys.person.patient;


import com.sprugevics.hsys.appointment.Appointment;
import com.sprugevics.hsys.person.Address;
import com.sprugevics.hsys.person.Person;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class Patient extends Person {

    private Gender gender;


    @OneToMany(mappedBy="patient")
    private Set<Appointment> appointments;

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

    public Set<Appointment> getAppointments() {
        return appointments;
    }

    public void addAppointment(Appointment appointment) {
        this.appointments.add(appointment);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "gender=" + gender +
                ", appointments=" + appointments +
                '}';
    }
}
