/**
 * 
 */
package com.payment.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.payment.api.entity.Payment;

/**
 * @author Jeena A V
 *
 */
@Repository
public interface PaymentRepositiry extends JpaRepository<Payment, Integer>{

}
