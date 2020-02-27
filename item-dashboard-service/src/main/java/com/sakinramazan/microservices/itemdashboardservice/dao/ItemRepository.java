package com.sakinramazan.microservices.itemdashboardservice.dao;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface ItemRepository extends JpaRepository<AbstractReadWriteAccess.Item, Long> {
}
