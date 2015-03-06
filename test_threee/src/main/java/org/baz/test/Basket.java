package org.baz.test;

import java.util.HashMap;
import java.util.Map;


public class Basket {

	private Map<Product, Integer> products;
	
	public Basket() {
		products = new HashMap<Product, Integer>();
	}

	public Integer numberOfProducts() {

		return (products != null ? products.size() : 0);
		
	}

	public void addProduct(Product product) {

		if (products==null)
			products = new HashMap<Product, Integer>();
		
		int qty_add_to_basket = 1;
		int qty_basket = 0;
		if (products.containsKey(product))
			qty_basket = products.get(product);
			
		products.put(product, qty_basket + qty_add_to_basket);
	}

	public Object qtyForProducts(Product product) {

		if (products.containsKey(product))
			return products.get(product);
		
		return 0;
	}

	public void removeProduct(Product product) {

		if (products.containsKey(product))
			products.remove(product);
	}
	
	
	
}
