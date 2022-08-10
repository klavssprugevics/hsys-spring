package com.sprugevics.hsys.department;

import com.sprugevics.hsys.person.doctor.Doctor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Department {

    @Id
    @GeneratedValue(generator="increment")
    private long departmentId;
    private String name;

    private static List<Doctor> departmentDoctors = new ArrayList<Doctor>();

    public Department() {
    }

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<Doctor> getDepartmentDoctors() {
        return departmentDoctors;
    }

    public static void setDepartmentDoctors(List<Doctor> departmentDoctors) {
        Department.departmentDoctors = departmentDoctors;
    }

    public static void addDoctor(Doctor d) {
        departmentDoctors.add(d);
    }
}
