package concurrency;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Festival {

    public static void main(String[] args) {

        BlockingQueue<TicketType> queue = new ArrayBlockingQueue<>(1024);
        FestivalGate festivalGate = new FestivalGate(queue);

            new Thread(new FestivalAttendeeThread(festivalGate)).start();


        new Thread(new FestivalStatisticsThread(festivalGate)).start();

    }
}
