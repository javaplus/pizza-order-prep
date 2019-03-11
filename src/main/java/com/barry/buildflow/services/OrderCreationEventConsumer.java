package com.barry.buildflow.services;

import com.barry.buildflow.controllers.WebSocketController;
import com.barry.buildflow.entities.Order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderCreationEventConsumer {
    
    @Autowired
    private SimpMessagingTemplate template;

    @Autowired
    private WebSocketController webSocketController;
    
    @KafkaListener(topics="test", groupId="bakerFlow")
    public void consumeEvents(Order order){
        System.out.println("Got message:" + order.getItem() + ":" + order.getName());
        template.convertAndSend("/topic/orders", order);
    }

}