package com.example.B40API.Repository;

import com.example.B40API.Models.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/*Enable the CRUD operation.*/
@Repository
public interface BankAccountRepository extends JpaRepository<BankAccount, Integer> {

}
//public interface BankAccountRepository {
//
//}
