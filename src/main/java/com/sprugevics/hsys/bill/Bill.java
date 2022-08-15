package com.sprugevics.hsys.bill;

import com.sprugevics.hsys.appointment.Appointment;

import javax.persistence.*;

@Entity
public class Bill {

    @Id
    @GeneratedValue(generator="increment")
    private long billId;
    private float sum;
    private boolean isPayed;

    @OneToOne(mappedBy="bill")
    private Appointment appointment;

    public Bill() {
    }

    public Bill(float sum, boolean isPayed) {
        this.sum = sum;
        this.isPayed = isPayed;
    }

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public void setPayed(boolean payed) {
        isPayed = payed;
    }

    public void pay() {
        setPayed(true);
    }

    @Override
    public String toString() {
        return "Bill{" +
                "billId=" + billId +
                ", sum=" + sum +
                ", isPayed=" + isPayed +
                '}';
    }
}
