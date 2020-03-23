package concurrency;

public class FestivalGateThread implements Runnable {

    private FestivalGate festivalGate;

    public FestivalGateThread(FestivalGate festivalGate) {
        this.festivalGate = festivalGate;
    }

    @Override
    public void run() {
        festivalGate.assignGateNumber();
    }
}
