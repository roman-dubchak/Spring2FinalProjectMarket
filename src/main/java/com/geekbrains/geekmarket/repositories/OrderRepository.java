package com.geekbrains.geekmarket.repositories;

import com.geekbrains.geekmarket.entites.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {
}
