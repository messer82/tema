package concurrency;

import java.util.Random;

public class FestivalGate {

    private int gateNumber;

    public int getGateNumber() {
            return gateNumber;
    }

    public void setGateNumber(int gateNumber) {
            this.gateNumber = gateNumber;
    }

    @Override
    public String toString() {
        return "FestivalGate{" +
                "gateNumber=" + gateNumber +
                '}';
    }

    public int assignGateNumber() {
        gateNumber = new Random().nextInt(3) + 1;
        return gateNumber;
    }
}
