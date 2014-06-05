package onion;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by lyoung on 01/06/2014.
 */
public class OnionFarmTest {
    private OnionFarm onionFarm;
    private OnionConsumer junkie;

    @Before
    public void setUp() throws Exception {
        onionFarm = new OnionFarm(1);
        junkie = mock(OnionConsumer.class);
        onionFarm.addConsumer(junkie);
    }


    @Test
    public void shouldIncreasePriceInAShortage() throws Exception {
        onionFarm.adjustPrice(1.2);
        assertThat(onionFarm.getPrice(), is(new Double("1.2")));

    }

    @Test
    public void shouldDecreasePriceInASurplus() throws Exception {
        onionFarm.adjustPrice(0.2);
        assertThat(onionFarm.getPrice(), is(0.2));
    }

    @Test
    public void shouldPromptReaction() {
        onionFarm.adjustPrice(100);
        verify(junkie).priceReaction(100);

    }
}
