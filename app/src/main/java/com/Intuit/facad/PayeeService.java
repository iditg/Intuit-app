package com.Intuit.facad;

import com.Intuit.database.entities.Payee;
import com.Intuit.database.entities.PaymentMeyhod;
import com.Intuit.database.repositories.PayeeRepository;
import com.Intuit.database.repositories.PaymentMethodRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class PayeeService {
    PayeeRepository payeeRepository;


    public PayeeService(PayeeRepository payeeRepository) {
        this.payeeRepository = payeeRepository;
    }

    public Payee getById(Integer payeeId)  {
        return payeeRepository.findById(payeeId).orElseThrow(()-> new EntityNotFoundException("payee not found"));
    }

    public List<Payee> getAllInfo() {
        List<Payee> all = payeeRepository.findAll();
        return all;
    }
}
