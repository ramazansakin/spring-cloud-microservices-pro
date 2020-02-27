package com.sakinramazan.microservices.interactionservice.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class Item implements Serializable {
    private String name;
}
