/**
 * 
 */
package com.order.api.service;

import org.springframework.stereotype.Service;

import com.order.api.entity.Order;

/**
 * @author Jeena A V
 *
 */

public interface OrderService {
	
	public Order saveOrder(Order order);

}
