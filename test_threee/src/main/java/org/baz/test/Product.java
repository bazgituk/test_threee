package org.baz.test;

public class Product {

	private double price;
	private String name;

	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	
	public double getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
