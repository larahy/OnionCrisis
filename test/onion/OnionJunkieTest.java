package onion;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class OnionJunkieTest {
    OnionJunkie kumar;
    private PrintStream message;

    @Before
    public  void setUp() {

        message = mock(PrintStream.class);
        kumar = new OnionJunkie(message);
    }

    @Test
    public void testPriceReaction() throws Exception {
        kumar.priceReaction(30);
        verify(message).println("J'adore les oignons");
    }


    @Test
    public void testSuicide() throws Exception {
        kumar.priceReaction(101);
        assertFalse(kumar.isLiving());
    }
}