package com.sakinramazan.microservices.interactionservice.controller;


import com.sakinramazan.microservices.interactionservice.client.ItemClient;
import com.sakinramazan.microservices.interactionservice.dto.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/item-chooser")
class GoodItemApiAdapterRestController {
    private final ItemClient itemClient;

    public GoodItemApiAdapterRestController(ItemClient itemClient) {
        this.itemClient = itemClient;
    }

    @GetMapping("/best-items")
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