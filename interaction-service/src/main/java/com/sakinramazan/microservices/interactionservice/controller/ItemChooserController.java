package com.sakinramazan.microservices.interactionservice.controller;


import com.sakinramazan.microservices.interactionservice.ItemClient;
import com.sakinramazan.microservices.interactionservice.dto.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
class GoodItemApiAdapterRestController {
    private final ItemClient itemClient;

    public GoodItemApiAdapterRestController(ItemClient itemClient) {
        this.itemClient = itemClient;
    }

    @GetMapping("/top-brands")
    public Collection<Item> goodItems() {
        return itemClient.readItems()
                .stream()
                .filter(this::isGreat)
                .collect(Collectors.toList());
    }

    private boolean isGreat(Item item) {
        return !item.getName().equals("Sample Item-1") &&
                !item.getName().equals("Sample Item-2");
    }
}