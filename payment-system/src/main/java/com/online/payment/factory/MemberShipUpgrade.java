/**
 * 
 */
package com.online.payment.factory;

/**
 * @author Thasil Mohamed
 *
 */
public class MemberShipUpgrade implements Payment {

	/* (non-Javadoc)
	 * @see com.online.payment.factory.Payment#makePayment(java.lang.String)
	 */
	@Override
	public void makePayment(String paymentType) {
		System.out.println("Membership will be upgraded");

	}

}
