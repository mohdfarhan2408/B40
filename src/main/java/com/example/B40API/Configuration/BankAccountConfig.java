package com.example.B40API.Configuration;

import com.example.B40API.Models.Donation;
import com.example.B40API.Repository.BankAccountRepository;
import com.example.B40API.Models.BankAccount;
import com.example.B40API.Repository.DonationRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;



@Configuration
public class BankAccountConfig {

    @Bean
    CommandLineRunner commandLineRunner(BankAccountRepository repository, DonationRepository donationRepository) {

        return args -> {

                    BankAccount maybank = new BankAccount(
                            "MAYBANK",
                            "AF78990234",
                            2.34,
                            3.45
                    );


                    BankAccount cimb = new BankAccount(
                    "CIMB",
                    "BD345789",
                    10.34,
                    4.5
                    );

                    Donation donor1= new Donation(
                            5000,
                            "Bubur Ayam"
                    );

                    repository.saveAll( //save into db
                        List.of(maybank, cimb)
                    );

                    donationRepository.saveAll(
                            List.of(donor1)
                    );
        };
    }
}
