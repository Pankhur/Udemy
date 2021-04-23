package com.udemytest.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


//This class will handle all the incoming request

@RestController
public class ProductController {

	ArrayList<ProductInfo> prodlist = new ArrayList<ProductInfo>(); 
	
	//Dependency Injection 
	//Import it from spring web client and if we use @Autowired annotation then we have to also declare a bean for it 
	@Autowired
	private RestTemplate restTemplate;
	
	//This to get details of product from Product Model
	@GetMapping("/product/details/{productID}")
	public ProductModel getProductDetails(@PathVariable Long productID) {
		
		//getProductInfo(productID);
		//System.out.println("Hello");
		ProductInfo prod = getProductInfo(productID);
		//return prod;
		return new ProductModel(prod.getProductId(),prod.getProductDescription(),prod.getProductName(),99,true);
		//return new ProductModel(101L,"Name","Desc",99,true);
		
		//We can use the rest template object to create a request to get product price or stock data via api url of other micro services
		//Get price from price service
		Price price = restTemplate.getForObject("http://localhost:8009/product/"+productID, Price.class);
		
		
		
		
	}
	
	//This is to test the root URL is working or not
	@GetMapping("/") 
	public String hello() {
		System.out.println("Correct Path");
		return "hello all good here!";
	}
	
	private ProductInfo getProductInfo (Long productID) {
		populateProductList();
		//return null;
		for(ProductInfo p: prodlist) {
			if (productID.equals(p.getProductId())) {
				return p;
			}
		}
		return null;
		
	}
	
	private void populateProductList() {
		
		//Since array list takes only object, we can add in 2 ways like below  
		ProductInfo p = new ProductInfo(102l,"Name here", "Description here");
		prodlist.add(p);
		             //OR
		prodlist.add(new ProductInfo(103l,"Name here", "Description here"));
	}
}
