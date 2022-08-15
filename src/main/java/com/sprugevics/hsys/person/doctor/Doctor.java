package com.sprugevics.hsys.person.doctor;

import com.sprugevics.hsys.appointment.Appointment;
import com.sprugevics.hsys.person.Address;
import com.sprugevics.hsys.person.Person;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Set;

@Entity
public class Doctor extends Person {

    private Department department;

    @OneToMany(mappedBy="doctor")
    private Set<Appointment> appointments;

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

    public Set<Appointment> getAppointments() {
        return appointments;
    }

    public void addAppointment(Appointment appointment) {
        this.appointments.add(appointment);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "department=" + department +
                ", appointments=" + appointments +
                '}';
    }
}
