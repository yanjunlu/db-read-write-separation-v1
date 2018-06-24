package com.lu.demo;

import static org.junit.Assert.*;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lu.demo.entity.Order;
import com.lu.demo.service.OrderService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml"})
public class OrderTest {
	
	@Autowired
	private OrderService orderService;
	
	@Test
	public void addOrderTest() {
		Order order = new Order();
		order.setId((long) 100);
		order.setState("xxxx");
		orderService.addOrder(order);
	}
	
	@Test
	public void getOrderByIdTest() {
		long id = 1;
		Order order = orderService.getOrderById(id);
		System.out.println(order.getId() + ":" + order.getState());
	}

}
