package com.sakinramazan.microservices.itemdashboardservice.dao;

import com.sakinramazan.microservices.itemdashboardservice.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
}
