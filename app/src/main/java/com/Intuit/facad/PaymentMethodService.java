package com.Intuit.facad;

import com.Intuit.database.entities.PaymentMeyhod;
import com.Intuit.database.repositories.PaymentMethodRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class PaymentMethodService {
    PaymentMethodRepository paymentMethodRepository;


    public PaymentMethodService(PaymentMethodRepository paymentMethodRepository) {
        this.paymentMethodRepository = paymentMethodRepository;
    }

    public PaymentMeyhod getById(Integer methodId)  {
        return paymentMethodRepository.findById(methodId).orElseThrow(()-> new EntityNotFoundException("method not found"));
    }

    public List<PaymentMeyhod> getAllInfo() {
        List<PaymentMeyhod> all = paymentMethodRepository.findAll();
        return all;
    }

}
