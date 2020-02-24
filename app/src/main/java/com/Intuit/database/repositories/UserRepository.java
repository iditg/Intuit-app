package com.Intuit.database.repositories;

import com.Intuit.database.entities.PaymentMeyhod;
import com.Intuit.database.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findById(Integer id);
    Optional<User> findByGuid(String guid);
    List<User> findAll();

}