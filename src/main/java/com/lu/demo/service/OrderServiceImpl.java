package com.lu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lu.demo.dao.OrderMapper;
import com.lu.demo.entity.Order;
import com.lu.demo.utils.DBContextHolder;
import com.lu.demo.utils.DBType;

@Service("orderService")
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderMapper orderMapper;

	@Override
	public void addOrder(Order order) {
		DBContextHolder.setDBType(DBType.DB_TYPE_MASTER);
		orderMapper.insert(order);

	}

	@Override
	public Order getOrderById(long id) {
		DBContextHolder.setDBType(DBType.DB_TYPE_SLAVE_ONE);
		return orderMapper.selectByPrimaryKey(id);
	}

}
