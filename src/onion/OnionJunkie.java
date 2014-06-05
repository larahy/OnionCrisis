package onion;

import java.io.PrintStream;

/**
 * Created by lyoung on 01/06/2014.
 */
public class OnionJunkie implements OnionConsumer {

    private boolean alive = true;
    private java.io.PrintStream printStream;

    public OnionJunkie(PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    public void priceReaction(double change) {
        if (change > 100) {
            suicide();
        }  else {
            printStream.println("J'adore les oignons");
        }
    }


    public void suicide() {
        this.alive = false;
    }

    public boolean isLiving() {
        return alive;
    }
}
