package com.online.payment.factory;

import com.online.payment.main.ProductTypeConstants;

public class ProductFactory {

	public Payment getProductType(String productType) {

		if (productType == null) {
			return null;
		}
		if (ProductTypeConstants.PHYSICAL_PRODUCT.equalsIgnoreCase(productType)) {
			return new PhysicalProduct();
		} else if (ProductTypeConstants.BOOK.equalsIgnoreCase(productType)) {
			return new BookPurchase();
		} else if (ProductTypeConstants.MEMBERSHIP_ACTIVATION.equalsIgnoreCase(productType)) {
			return new MemberShipActivation();
		} else if (ProductTypeConstants.MEMBERSHIP_UPGRADE.equalsIgnoreCase(productType)) {
			return new MemberShipUpgrade();
		} else if (ProductTypeConstants.VIDEO_PURCHASE.equalsIgnoreCase(productType)) {
			return new VideoPurchase();
		}
		return null;
	}

}
