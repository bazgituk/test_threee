package test_threee;

import org.baz.test.RemoveProductsFromBasketTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AddingProductsToBasketTest.class,
				RemoveProductsFromBasketTest.class
			})
public class AllBasketTests {

}
