/**
 * 
 */
package com.order.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.api.entity.Order;
import com.order.api.service.OrderService;

/**
 * @author Jeena A V
 *
 */

@RestController
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	OrderService orderService;

	@PostMapping("/bookOrder")
	public ResponseEntity<Order> saveOrder(@RequestBody Order order) {
		return new ResponseEntity<>(orderService.saveOrder(order), HttpStatus.CREATED);
	}

}
