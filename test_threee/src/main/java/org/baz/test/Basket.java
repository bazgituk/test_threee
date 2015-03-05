package org.baz.test;

import java.util.HashMap;
import java.util.Map;


public class Basket {

	Map<Product, Integer> products = new HashMap<>();
	
	public Basket() {
	}

	public Integer numberOfProducts() {

		return (products != null ? products.size() : 0);
		
	}

	public void addProduct(Product product_one) {

		products.put(product_one, 1);
	}
	
	
	
}
