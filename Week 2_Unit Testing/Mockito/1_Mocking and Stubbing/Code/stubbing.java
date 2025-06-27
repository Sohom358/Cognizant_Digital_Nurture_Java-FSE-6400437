import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.Assert.*;


public class stubbing {
    @Test
    public void test() {
        Fake m = Mockito.mock(Fake.class);
        when(m.dummy()).thenReturn("Mock stubbing is successful...");

        String result = m.dummy();
        assertEquals("Mock stubbing is successful...", result);
        System.out.println("Test is successful...");
    }
}
