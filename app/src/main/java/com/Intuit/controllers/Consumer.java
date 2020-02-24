package com.Intuit.controllers;

import com.Intuit.database.entities.NewPaymentRequest;
import org.apache.kafka.clients.producer.Producer;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.logging.Logger;


@Service
public class Consumer {

    private final Logger logger = (Logger) LoggerFactory.getLogger(Producer.class);

    @KafkaListener(topics = "payments", groupId = "group_id")
    public void consume(NewPaymentRequest message) throws IOException {
        logger.info(String.format("#### -> Consumed message -> %s", message));
    }
}