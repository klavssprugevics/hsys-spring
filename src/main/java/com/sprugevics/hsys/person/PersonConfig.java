package com.sprugevics.hsys.person;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class PersonConfig {

    @Bean
    CommandLineRunner commandLineRunner(PersonRepository personRepository) {
        return args -> {
          Person p1 = new Person("James", "Bean", "22222222", "james.b@gmail.com", LocalDate.of(1993, 6, 4));

          personRepository.saveAll(List.of(p1));
        };
    }
}
