package com.example.B40API.Controller;


import com.example.B40API.Models.Donation;
import com.example.B40API.Repository.DonationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping(path = "donations")
public class DonationAPI {

    private DonationRepository donationRepository;

    public DonationAPI(DonationRepository donationRepository) {
        this.donationRepository = donationRepository;
    }

    @Autowired
    //GET

    //GET all donations
    @GetMapping
    public List<Donation> getAllDonations() {
        return donationRepository.findAll();
    }

    //GET individual donation
    @GetMapping(path = "{id}")
    Donation getDonationBytId(@PathVariable("id") Integer id) {
        return donationRepository.findById(id).orElseThrow(() -> new IllegalStateException("Sorry Donation for this item couldn't be found our reccord"));
    }

    //POST
    @PostMapping
    Donation addDonation(@RequestBody Donation newDonation) {
        return donationRepository.save(newDonation);
    }

    //UPDATE
    @PutMapping(path = "{id}")
    Donation updateDonation(@PathVariable("id") Integer id,@RequestBody Donation donationDetails) {

        Donation updatedDonation = donationRepository.findById(id).get();

        updatedDonation.setDonationAmount(donationDetails.getDonationAmount());
        updatedDonation.setDonationItems(donationDetails.getDonationItems());

        return updatedDonation;
    }

    //DELETE
    @DeleteMapping(path = "{id}")
    public void deleteDonation(@PathVariable("id") Integer id) {
        donationRepository.deleteById(id);
    }
}
