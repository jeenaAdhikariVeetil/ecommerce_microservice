/**
 * 
 */
package com.payment.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.payment.api.entity.Payment;
import com.payment.api.service.PaymentService;

/**
 * @author Jeena A V
 *
 */
@RestController
@RequestMapping("/payment")
public class PaymentController {

	@Autowired
	PaymentService payService;

	@PostMapping("/doPayment")
	public ResponseEntity<Payment> doPayment(@RequestBody Payment payment) {
		return new ResponseEntity<>(payService.doPayment(payment), HttpStatus.CREATED);
	}

}
