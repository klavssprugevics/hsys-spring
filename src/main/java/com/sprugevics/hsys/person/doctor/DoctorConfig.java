package com.sprugevics.hsys.person.doctor;

import com.sprugevics.hsys.department.Department;
import com.sprugevics.hsys.department.DepartmentRepository;
import com.sprugevics.hsys.person.Address;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class DoctorConfig {

    @Bean
    CommandLineRunner commandLineRunnerDoctor(DoctorRepository doctorRepository, DepartmentRepository departmentRepository) {
        return args -> {
          Department dep1 = new Department("Cardiology");
          Doctor d1 = new Doctor("James", "Bean", "22222222", "james.b@gmail.com",
                  LocalDate.of(1993, 6, 4),
                  new Address("Latvia", "Ventspils", "LV-3601", "Inženieru 3"), "Surgery", "ER");
          doctorRepository.saveAll(List.of(d1));
          Department.addDoctor(d1);
          System.out.println(Department.getDepartmentDoctors().toString());
          departmentRepository.saveAll(List.of(dep1));


        };
    }
}
