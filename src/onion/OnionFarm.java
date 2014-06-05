package onion;

import java.util.ArrayList;

/**
 * Created by lyoung on 01/06/2014.
 */
public class OnionFarm {
    private Double price;
    ArrayList<OnionConsumer> consumers = new ArrayList<OnionConsumer>();

    public OnionFarm (double defaultPrice) {
        this.price = defaultPrice;
    }


    public double getPrice() {
        return price;
    }

    public void adjustPrice(double change) {
        this.price = getPrice() * change;
        for (OnionConsumer consumer : consumers) {
            consumer.priceReaction(change);
        }
    }

    public void addConsumer(OnionConsumer consumer) {
        consumers.add(consumer);
    }
}
