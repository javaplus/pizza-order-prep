package com.barry.buildflow.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class StatusController {

    @RequestMapping(value="/orders/{id}/status", method=RequestMethod.GET)
    public String requestMethodName(@PathVariable String id) {
        return "Order status for id:" + id;
    }
    
    
}