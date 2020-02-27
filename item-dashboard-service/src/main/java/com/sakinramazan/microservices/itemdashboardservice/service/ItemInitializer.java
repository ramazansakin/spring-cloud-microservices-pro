package com.sakinramazan.microservices.itemdashboardservice.service;

import com.sakinramazan.microservices.itemdashboardservice.dao.ItemRepository;
import com.sakinramazan.microservices.itemdashboardservice.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
class ItemInitializer implements CommandLineRunner {

    private final ItemRepository itemRepository;

    @Autowired
    ItemInitializer(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    // Sample items to test as eureka client
    @Override
    public void run(String... args) throws Exception {
        Stream.of("Sample Item-1", "Sample Item-2", "Sample Item-3", "Sample Item-4", "Sample Item-5")
                .forEach(name -> itemRepository.save(new Item(name)));

        itemRepository.findAll().forEach(System.out::println);
    }
}
