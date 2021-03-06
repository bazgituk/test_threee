package test_threee;

import static org.junit.Assert.*;

import org.baz.test.Basket;
import org.baz.test.Product;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class RemoveProductsFromBasketTest {

	Product product_one;
	Product product_two;
	Basket basket;
	
	@Before
	public void setup() {
		basket = new Basket();
		product_one = new Product("Prod_A", 5.34);
		product_two = new Product("Prod_B", 10.99);
		
	}
	
	@After
	public void teardown() {
		product_one = null;
		product_two = null;
		basket = null;
	}

	
	@Test
	public void removeProductFromBasketTest() {
		basket.addProduct(product_one);
		
		assertSame("Placed product before remove", 1, basket.numberOfProducts());
		
		basket.removeProduct(product_one);
		
		assertSame("Removed product - No items in basket", 0, basket.numberOfProducts());
	}
}
