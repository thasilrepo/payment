package com.online.payment.factory;

public class BookPurchase implements Payment {

	@Override
	public void makePayment(String paymentType) {
		System.out.println("Shipment details  slip will be sent to royalty department");

	}

}
