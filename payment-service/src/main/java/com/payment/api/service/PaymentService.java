/**
 * 
 */
package com.payment.api.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.payment.api.entity.Payment;

/**
 * @author Jeena A V
 *
 */

public interface PaymentService {

	public Payment doPayment(Payment payment);
	
}
