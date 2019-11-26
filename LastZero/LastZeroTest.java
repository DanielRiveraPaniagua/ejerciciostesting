import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class LastZeroTest{
	@Test public void noZero(){
		int arr[] = {1,2,3,4,5,6,7,8,9};
		assertEquals("noZero",-1,LastZero.lastZero(arr));
	};
}
