package com.example.B40API.Controller;


import com.example.B40API.Models.BankAccount;
import com.example.B40API.Repository.BankAccountRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/bank-accounts")
public class BankAccountAPI {

    private BankAccountRepository repository;

    //Constructor
    public BankAccountAPI(BankAccountRepository repository) {
        this.repository = repository;
    }


    /*GET Method*/

    //GET All Bank Accounts
    @GetMapping
    List<BankAccount> getBankAccount() {
        return repository.findAll();
    }

    //GET individual Bank Accounts
    @GetMapping(path = "{id}")
    BankAccount getIndividualBankAccount(@PathVariable("id") Integer id) {
        return repository.findById(id).orElseThrow(() -> new IllegalStateException("Cannot find bank account, please insert a right details"));
    }


    //POST
    @PostMapping
    BankAccount addBankAccount(@RequestBody BankAccount newBankAccount) {
        return repository.save(newBankAccount);
    }


    //PUT
    @PutMapping(path = "{id}")
    BankAccount updateBankAccount(@PathVariable("id") Integer id, @RequestBody BankAccount bankAccountDetails) {

        BankAccount updatedBankDetails = repository.findById(id).get();

        updatedBankDetails.setAccountNumber(bankAccountDetails.getAccountNumber());
        updatedBankDetails.setBankName(bankAccountDetails.getBankName());
        updatedBankDetails.setDebt(bankAccountDetails.getDebt());
        updatedBankDetails.setCreditRating(bankAccountDetails.getCreditRating());

        return  updatedBankDetails;
    }


    //DELETE
    @DeleteMapping(path = "{id}")
    public void deleteBankAccount(@PathVariable Integer id){
        repository.deleteById(id);
    }

}
