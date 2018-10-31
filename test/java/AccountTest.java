import org.junit.Assert;
import org.junit.Test;

import com.qa.util.Service;

public class AccountTest {

	@Test
	public void test() {
		
		Service.addAccount("John", "Doe");
		Service.addAccount("Joe", "Bloggs");
		Service.addAccount("Steve", "Mnuchin");
		Service.addAccount("John", "Brown");
		Service.addAccount("Jon", "Bamber");
		
		int actual = Service.getCountByName("Jon");
		
		Assert.assertEquals(1, actual);
		
	}

}
