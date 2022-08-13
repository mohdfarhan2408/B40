//package com.example.B40API.Configuration;
//
//import com.example.B40API.Models.BankAccount;
//import com.example.B40API.Models.Donation;
//import com.example.B40API.Repository.BankAccountRepository;
//import com.example.B40API.Repository.DonationRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.List;
//
//@Configuration
//public class DonationConfig {
//
//    @Bean
//    CommandLineRunner commandLineRunner(DonationRepository donationRepository) {
//
//        return args -> {
//
//            Donation donor1= new Donation(
//                    5000,
//                    "Bubur Ayam"
//            );
//
//            donationRepository.saveAll( //save into db
//                    List.of(donor1)
//            );
//        };
//    }
//}
