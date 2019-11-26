import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class OddOrPosTest{
  @Test (expected = NullPointerException.class) public void nullArray(){
		int arr[] = null;
    OddOrPos.oddOrPos(arr);
	}
  @Test public void lastPosition(){
    int arr[] = {1,2,3,4,5,6,7,8,9};
    assertEquals("lastPosition",9,OddOrPos.oddOrPos(arr));
  }
}
