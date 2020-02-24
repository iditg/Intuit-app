package com.Intuit.database.repositories;

import com.Intuit.database.entities.Payee;
import com.Intuit.database.entities.PaymentMeyhod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PayeeRepository extends JpaRepository<Payee, Integer> {

    Optional<Payee> findById(Integer id);
    Optional<Payee> findByGuid(String guid);
    List<Payee> findAll();


}
