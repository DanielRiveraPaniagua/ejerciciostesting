import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class FindLastTest{
	@Test public void lastPosition(){
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int y = 9
		assertEquals("lastPosition",8,FindLast.findlast(arr,y));
	}
	@Test public void noPosition(){
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int y = 0
		assertEquals("noPosition",-1,FindLast.findlast(arr,y));
	}
}
