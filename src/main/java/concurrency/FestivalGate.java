package concurrency;

import java.util.Random;

public class FestivalGate{
    private int gateNumber;

    Random random = new Random();

    public int getGateNumber() {
        synchronized (this) {
            return gateNumber;
        }
    }

    public void setGateNumber(int gateNumber) {
        synchronized (this) {
            this.gateNumber = gateNumber;
        }
    }

    @Override
    public String toString() {
        return "FestivalGate{" +
                "gateNumber=" + gateNumber +
                '}';
    }

    public int assignGateNumber() {
        gateNumber = random.nextInt(10);
        return gateNumber;
    }
}
