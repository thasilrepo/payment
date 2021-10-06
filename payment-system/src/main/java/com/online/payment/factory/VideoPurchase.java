/**
 * 
 */
package com.online.payment.factory;

/**
 * @author Thasil Mohamed
 *
 */
public class VideoPurchase implements Payment {

	/* (non-Javadoc)
	 * @see com.online.payment.factory.Payment#makePayment(java.lang.String)
	 */
	@Override
	public void makePayment(String paymentType) {
		System.out.println("Video link will be sent");

	}

}
