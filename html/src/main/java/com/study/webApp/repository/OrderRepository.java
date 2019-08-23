package com.study.webApp.repository;

import com.study.webApp.domen.Order;

import java.util.List;

public interface OrderRepository {
    void save(Order order);

    void delete(Order order);

    List<Order> getAll();

    Order getById(Integer id);
}
