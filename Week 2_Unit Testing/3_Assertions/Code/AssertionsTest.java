import  org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class AssertionsTest{
    @Test
    public void testAssertions() {

    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter a...");
    	int a=sc.nextInt();
    	System.out.println("Enter b...");
    	int b=sc.nextInt();
    	
    	assertEquals(5, a + b);
    	
    	assertTrue(a > b);
    	
    	assertFalse(a < b);
    	
    	assertNull(null);
    	
    	assertNotNull(new Object());
    	
    	System.out.println("All test cases are passed...");
    	
    	sc.close();
    }
}