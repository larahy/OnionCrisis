package onion;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FiletMOnionTest {

    @Test
    public void testPriceReaction() throws Exception {
        FiletMOnion filetMOnion = new FiletMOnion();
        filetMOnion.priceReaction(1.5);
        assertThat(filetMOnion.getFrenchOnionSoupPrice(), is(5.25));
    }
}