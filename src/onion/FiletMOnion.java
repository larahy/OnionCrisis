package onion;

/**
 * Created by lyoung on 01/06/2014.
 */
public class FiletMOnion implements OnionConsumer {
    Double frenchOnionSoupPrice = 3.50;

    @Override
    public void priceReaction(double change) {
        adjustMenu(change);
    }

    public void adjustMenu(double change) {
        this.frenchOnionSoupPrice = getFrenchOnionSoupPrice() * change;
    }

    public double getFrenchOnionSoupPrice() {
        return frenchOnionSoupPrice;
    }
}
