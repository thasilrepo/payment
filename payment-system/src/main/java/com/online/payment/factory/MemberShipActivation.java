package com.online.payment.factory;

public class MemberShipActivation implements Payment {

	@Override
	public void makePayment(String paymentType) {
		System.out.println("Membership will be activated");
	}

}
