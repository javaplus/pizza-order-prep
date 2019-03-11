package com.barry.buildflow.controllers;

import com.barry.buildflow.entities.Order;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

    @MessageMapping("/hello")
    @SendTo("/topic/orders")
    public Order sendOrder(Order order){
        System.out.println("SEnding order!!!! to websocket");
        return order;

    }
    
    
}