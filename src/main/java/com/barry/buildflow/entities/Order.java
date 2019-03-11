package com.barry.buildflow.entities;

import lombok.Getter;
import lombok.Setter;

public class Order {

    @Getter
    @Setter
    private String item;

    @Getter
    @Setter
    private String name;
}