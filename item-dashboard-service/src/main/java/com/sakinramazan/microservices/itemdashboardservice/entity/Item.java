package com.sakinramazan.microservices.itemdashboardservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Item implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    public Item(String name) {
        this.name = name;
    }
}