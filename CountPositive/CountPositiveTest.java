import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class CountPositiveTest{
	@Test (expected= NullPointerException.class) public void nullArray(){
		int arr[] = null;
		CountPositive.countPositive(arr);
	}
	@Test public void sinZeros(){
		int arr[] = {1,2,3,4,5,6,7,8,9};
		assertEquals("sinZeros",9,CountPositive.countPositive(arr));
	}
}
