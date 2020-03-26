package concurrency;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Festival {

    public static void main(String[] args) {

        BlockingQueue<FestivalAttendeeThread> queue = new ArrayBlockingQueue<>(1024);
        FestivalGate festivalGate = new FestivalGate();
//        ExecutorService service = Executors.newFixedThreadPool(150);

        for (int i = 0; i < 256; i++) {
            new Thread(new FestivalAttendeeThread(festivalGate)).start();
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

//        new Thread(new FestivalAttendeeThread(queue)).start();
//
//        new Thread(new FestivalStatisticsThread(queue, new Random().nextInt(3) + 1)).start();

    }
}
