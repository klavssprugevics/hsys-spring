package com.sprugevics.hsys.appointment;

import com.sprugevics.hsys.bill.Bill;
import com.sprugevics.hsys.bill.BillRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class AppointmentConfig {

    @Bean
    CommandLineRunner commandLineRunnerAppointment(AppointmentRepository appointmentRepository, BillRepository billRepository) {
        return args -> {
          Bill b1 = new Bill(33.33f, false);
          billRepository.saveAll(List.of(b1));
          Appointment a1 = new Appointment(LocalDate.of(2022, 9, 11), 111, Status.Active, b1);


          appointmentRepository.saveAll(List.of(a1));

          

        };
    }
}
