/**
 * 
 */
package com.payment.api.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payment.api.entity.Payment;
import com.payment.api.repository.PaymentRepositiry;

/**
 * @author Jeena A V
 *
 */
@Service
public class PaymentServiceImpl implements PaymentService{
	
	@Autowired
	PaymentRepositiry paymentRepositiry;

	@Override
	public Payment doPayment(Payment payment) {
		payment.setTarnscationId(UUID.randomUUID().toString());
		return paymentRepositiry.save(payment);
	}
}
