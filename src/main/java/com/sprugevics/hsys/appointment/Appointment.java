package com.sprugevics.hsys.appointment;

import com.sprugevics.hsys.bill.Bill;
import com.sprugevics.hsys.person.doctor.Doctor;
import com.sprugevics.hsys.person.patient.Patient;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Appointment {

    @Id
    @GeneratedValue(generator="increment")
    private long appointmentId;

    private LocalDate time;
    private int roomNumber;
    private Status status;

    @ManyToOne
    @JoinColumn(name="doctor_id")
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name="patient_id")
    private Patient patient;

    @OneToOne
    @JoinColumn(name="bill_id")
    private Bill bill;

    public Appointment() {
    }

    public Appointment(LocalDate time, int roomNumber, Status status, Bill bill) {
        this.time = time;
        this.roomNumber = roomNumber;
        this.status = status;
        this.bill = bill;
    }

    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "appointmentId=" + appointmentId +
                ", time=" + time +
                ", roomNumber=" + roomNumber +
                ", status=" + status +
                ", bill=" + bill +
                '}';
    }
}
