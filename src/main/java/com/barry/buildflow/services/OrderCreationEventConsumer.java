package com.barry.buildflow.services;

import com.barry.buildflow.entities.Order;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderCreationEventConsumer {
    
    
    @KafkaListener(topics="test", groupId="bakerFlow")
    public void consumeEvents(Order order){
        System.out.println("Got message:" + order.getItem() + ":" + order.getName());
    }

}