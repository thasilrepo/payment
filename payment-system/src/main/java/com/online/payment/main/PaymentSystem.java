package com.online.payment.main;

import java.util.Scanner;

import com.online.payment.factory.Payment;
import com.online.payment.factory.ProductFactory;

public class PaymentSystem {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Online payment store ");		
		
		System.out.println();
		System.out.println("Here is your payment code to make payment");
		System.out.println();
		System.out.println("Physical product-PHYSICAL_PRODUCT");
		System.out.println();
		System.out.println("Book Purchase-BOOK");
		System.out.println();
		System.out.println("Membership Activation-MEMBERSHIP_ACTIVATION");
		System.out.println();
		System.out.println("Membership upgrade-MEMBERSHIP_UPGRADE");
		System.out.println();
		System.out.println("Video purchase-VIDEO_PURCHASE");
		System.out.println();
		
		System.out.println("Please enter your desired payment option");
		
		Scanner input=new Scanner(System.in);
		String productType=input.next();		
		ProductFactory productFactory= new ProductFactory();		
		
		Payment payment=productFactory.getProductType(productType);
		payment.makePayment(productType);
		

	}

}
