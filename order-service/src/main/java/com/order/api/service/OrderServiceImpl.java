/**
 * 
 */
package com.order.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.api.entity.Order;
import com.order.api.repository.OrderRepository;

/**
 * @author Jeena A V
 *
 */
@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public Order saveOrder(Order order) {

		return orderRepository.save(order);
	}

}
