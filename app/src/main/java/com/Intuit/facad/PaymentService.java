package com.Intuit.facad;

import com.Intuit.database.entities.*;
import com.Intuit.database.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.HashSet;
import java.util.List;

@Service
public class PaymentService {


    PayeeRepository payeeRepository;
    PaymentMethodRepository paymentMethodRepository;
    PaymentRepository paymentRepository;
    UserRepository userRepository;
    CurrencyRepository currencyRepository;


    @Autowired
    public PaymentService(PayeeRepository payeeRepository,
            PaymentMethodRepository paymentMethodRepository,
            PaymentRepository paymentRepository,
            UserRepository userRepository,
            CurrencyRepository currencyRepository) {
        this.payeeRepository=payeeRepository;
        this.paymentMethodRepository=paymentMethodRepository;
        this.paymentRepository=paymentRepository;
        this.userRepository=userRepository;
        this.currencyRepository = currencyRepository;
    }


    public int addPayment(NewPaymentRequest paymentRequest) throws Exception  {
        Payment newPayment = new Payment();
        newPayment.setAmount(paymentRequest.getAmount());

        Currency currency = currencyRepository.findByDescription(paymentRequest.getCurrency()).orElseThrow(() -> new EntityNotFoundException("currency not found"));
        newPayment.setCurrencyId(currency.getId());

        Payee payee = payeeRepository.findByGuid(paymentRequest.getPayee_guid()).orElseThrow(() -> new EntityNotFoundException("payee not found"));
        newPayment.setPayeeGuid(payee.getGuid());

        PaymentMeyhod paymentMethod = paymentMethodRepository.findByGuid(paymentRequest.getPaymentMethod_guid()).orElseThrow(() -> new EntityNotFoundException("payment Method not found"));;
        newPayment.setPaymentMethodGuid(paymentMethod.getGuid());

        newPayment.setStatus("NEW");//todo enum

        User user = userRepository.findByGuid(paymentRequest.getUser_guid()).orElseThrow(() -> new EntityNotFoundException("user not found"));;
        newPayment.setUserGuid(user.getGuid());

        paymentRepository.save(newPayment);
        return 1;
    }


}
