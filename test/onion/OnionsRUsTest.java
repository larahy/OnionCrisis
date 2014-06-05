package onion;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class OnionsRUsTest {

    private OnionsRUs onionsRUs;

    @Before
    public void setUp() throws Exception {
        onionsRUs = new OnionsRUs();
    }

    @Test
    public void testDefaultNoOfBillboards() throws Exception {
        assertThat(onionsRUs.getBillboards(), is(10));
    }

    @Test
    public void testBillboardReduction() {
        onionsRUs.abandonBillboards(5);
        assertThat(onionsRUs.getBillboards(), is(5));
    }

    @Test
    public void testBillboardIncrease() {
        onionsRUs.increaseBillboards(5);
        assertThat(onionsRUs.getBillboards(), is(15));
    }

    @Test
    public void shouldReactToOnionFarm() {
        assertThat(onionsRUs.getBillboards(), is(10));
        onionsRUs.priceReaction(5.5);
        assertThat(onionsRUs.getBillboards(), is(5));
    }
}