package com.udemytest.demo;

//It has been copied or imported from other Spring boot app 
public class Price {

	private int productID;
	private int priceID;
	private Integer originalprice;
	
	

	public Price(int productID, int priceID, Integer originalprice) {
		super();
		this.productID = productID;
		this.priceID = priceID;
		this.originalprice = originalprice;
	}

	public int getProductID() {
		return productID;
	}

	public void setProductID(int productID) {
		this.productID = productID;
	}

	public int getPriceID() {
		return priceID;
	}

	public void setPriceID(int priceID) {
		this.priceID = priceID;
	}

	public Integer getOriginalprice() {
		return originalprice;
	}

	public void setOriginalprice(Integer originalprice) {
		this.originalprice = originalprice;
	}
	
	
}
