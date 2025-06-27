import  org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class testCal {
	Calculator obj;
	Scanner sc=new Scanner(System.in);
	@Before
	public void setup()
	{
		obj=new Calculator();
		System.out.println("Setup is done...");
	}
	
	@After
	public void tear()
	{
		obj=null;
		System.out.println("Test Done...");
	}
	
	@Test
	public void t1()
	{
		System.out.println("Enter 2 values to add...");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		assertEquals("Failed", 10, obj.add(a, b));
	}

	@Test
	public void t2()
	{
		System.out.println("Enter 2 values to subtract...");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		assertEquals("Failed", 10, obj.sub(a, b));
	}

	@Test
	public void t3()
	{
		System.out.println("Enter 2 values to multiply...");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		assertEquals("Failed", 10, obj.mul(a, b));
	}

	@Test
	public void t4()
	{
		System.out.println("Enter 2 values to divide...");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		assertEquals("Failed", 10, obj.div(a, b));
	}

}
