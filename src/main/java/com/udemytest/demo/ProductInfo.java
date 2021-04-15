package com.udemytest.demo;

public class ProductInfo {

	private Long productId;
	private String productName;
	private String productDescription;
	
	
	public Long getProductId() {
		return productId;
	}


	public void setProductId(Long productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getProductDescription() {
		return productDescription;
	}


	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}


	ProductInfo(Long productId, String productName, String productDescription) {
		this.productDescription = productDescription;
		this.productId = productId;
		this.productName = productName;
	}
}
