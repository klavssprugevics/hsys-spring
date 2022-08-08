package com.sprugevics.hsys.person.patient;

import com.sprugevics.hsys.person.Address;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class PatientConfig {

    @Bean
    CommandLineRunner commandLineRunnerPatient(PatientRepository patientRepository) {
        return args -> {
            Patient p1 = new Patient("George", "Green", "23456543", "gg@gmail.com",
                    LocalDate.of(1998, 3, 3),
                    new Address("Latvia", "Ventspils", "LV-3601", "Ģertrūdes 1", "4"),
                    Gender.MALE);
            patientRepository.saveAll(List.of(p1));
        };
    };
}
