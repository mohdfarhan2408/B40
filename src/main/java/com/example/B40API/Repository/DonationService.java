package com.example.B40API.Repository;

import com.example.B40API.Models.Donation;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DonationService {

    ArrayList<Donation> donation = new ArrayList<Donation>();

    //Constructor
    public DonationService(ArrayList<Donation> donation) {
        this.donation = donation;
    }

    //READ


    //CREATE



    //UPDATE

    //DELETE

}
