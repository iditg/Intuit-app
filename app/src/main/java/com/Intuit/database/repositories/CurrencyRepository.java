package com.Intuit.database.repositories;

import com.Intuit.database.entities.Currency;
import com.Intuit.database.entities.Payee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CurrencyRepository extends JpaRepository<Currency, Integer> {
    Optional<Currency> findById(Integer id);
    List<Currency> findAll();
    Optional<Currency> findByDescription(String  description);

}