package com.lu.demo.service;

import com.lu.demo.entity.Order;

public interface OrderService {

	void addOrder(Order order);
	Order getOrderById(long id);
}
