package com.udemytest.demo;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;

//This class will hold all the product details

//@Data // this annotation will invoke all getter & setter so we don't have to write explicitly
//@NoArgsConstructor
//@AllArgsConstructor // this annotation to populate all fields with constructor parameters
public class ProductModel {
	
	private Long productId;
	private String productName;
	private String productDescription;
	private int productPrice;
	private boolean productStock;
	
	
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

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public boolean isProductStock() {
		return productStock;
	}

	public void setProductStock(boolean productStock) {
		this.productStock = productStock;
	}

	
	ProductModel(Long productID,String productName, String productDescription,int productPrice,boolean productStock) {
		this.productId = productID;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.productStock = productStock;
	}
}
