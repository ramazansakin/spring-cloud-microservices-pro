package com.sakinramazan.microservices.itemdashboardservice.controller;

import com.sakinramazan.microservices.itemdashboardservice.dao.ItemRepository;
import com.sakinramazan.microservices.itemdashboardservice.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemContoller {

    @Autowired
    private ItemRepository itemRepository;

    // Test Feign api
    @GetMapping(value = "/items")
    public List<Item> getItems() {
        return itemRepository.findAll();
    }
}
