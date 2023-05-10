/**
 * 
 */
package com.payment.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Jeena A V
 *
 */

@Entity
@Table(name="PAYMENT_TB")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
	@Id
	@GeneratedValue
	private int paymentId;
	private String paymentStatus;
	private String tarnscationId;

}
