import advanced.Service;
import org.junit.Assert;
import org.junit.Test;

public class AccountTest {

	@Test
	public void test() {
		
		Service.addAccount("John", "Doe");
		Service.addAccount("Joe", "Bloggs");
		Service.addAccount("Steve", "Mnuchin");
		Service.addAccount("John", "Brown");
		Service.addAccount("Jon", "Bamber");
		
		int actual = Service.getCountByName("John");
		
		Assert.assertEquals(2, actual);
		
	}

}
