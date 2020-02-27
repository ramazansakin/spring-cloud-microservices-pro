package com.sakinramazan.microservices.interactionservice.client;

import com.sakinramazan.microservices.interactionservice.dto.Item;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("item-dashboard-service")
public
interface ItemClient {
    @GetMapping("/items")
    List<Item> readItems();
}
