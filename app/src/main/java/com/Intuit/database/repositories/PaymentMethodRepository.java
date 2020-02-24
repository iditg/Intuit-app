package com.Intuit.database.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

import com.Intuit.database.entities.PaymentMeyhod;

@Repository
public interface PaymentMethodRepository extends JpaRepository<PaymentMeyhod, Integer> {

    Optional<PaymentMeyhod> findById(Integer id);
    Optional<PaymentMeyhod> findByGuid(String guid);
    List<PaymentMeyhod> findAll();
    Optional<PaymentMeyhod> findByDescription(String  description);

}
