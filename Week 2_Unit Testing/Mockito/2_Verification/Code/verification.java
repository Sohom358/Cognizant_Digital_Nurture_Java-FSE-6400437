import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class verification {
	
	@Test
	public void test()
	{
		External m=Mockito.mock(External.class);
		External_call obj=new External_call(m);
		obj.fetch();
		verify(m).dummy();
	}
}
