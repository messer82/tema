package concurrency;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

import static java.lang.Thread.sleep;

public class FestivalStatisticsThread implements Runnable {

    protected ArrayBlockingQueue queue = null;
    Random random = new Random();

    FestivalStatistics festivalStatistics = new FestivalStatistics();

    public FestivalStatisticsThread(ArrayBlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
        queue.take();
        festivalStatistics.makeStatistics();
        int gate = festivalStatistics.getGate();
        if (gate == random.nextInt(10)) {
            System.out.println("At gate " + gate + " " + queue.size() + " people entered.");
            switch (festivalStatistics.getTicket()) {
                case "one-day":
                    System.out.println(" people have one-day tickets.");
                    break;
                case "one-day-vip":
                    System.out.println(" people have one-day-vip tickets.");
                    break;
                case "free-pass":
                    System.out.println(" people have free-pass.");
                    break;
                case "full":
                    System.out.println(" people have full pass.");
                    break;
                case "full-vip":
                    System.out.println(" people have full-vip pass.");
                    break;
            }
        }
            sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
