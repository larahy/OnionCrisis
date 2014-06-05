package onion;

/**
 * Created by lyoung on 01/06/2014.
 */
public class OnionsRUs implements OnionConsumer {
    private int billboards = 10;

    public int getBillboards() {
        return billboards;
    }

    @Override
    public void priceReaction(double percentage) {
        if (percentage < 1) {
            increaseBillboards((int) percentage);
        } else if (percentage > 1) {
            abandonBillboards((int) percentage);
        }
    }

    public void increaseBillboards(int increase) {
        this.billboards = getBillboards() + increase;

    }

    public void abandonBillboards(int reduction) {
        this.billboards = getBillboards() - reduction;
    }



}
