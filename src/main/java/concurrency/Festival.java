package concurrency;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Festival {

    public static void main(String[] args) {

        BlockingQueue<FestivalAttendeeThread> queue = new ArrayBlockingQueue<>(1024);
//        ExecutorService service = Executors.newFixedThreadPool(150);

//        for (int i = 0; i < 256; i++) {
//            new Thread(new FestivalAttendeeThread(queue)).start();
//            new Thread(new FestivalAttendeeThread(queue)).start();
//            new Thread(new FestivalAttendeeThread(queue)).start();
//            new Thread(new FestivalAttendeeThread(queue)).start();
////            Thread thread = new Thread(new FestivalAttendeeThread(queue));
////            thread.start();
////            service.execute(new FestivalAttendeeThread(queue));
//        }

        new Thread(new FestivalAttendeeThread(queue)).start();
        
        new Thread(new FestivalStatisticsThread(queue, new Random().nextInt(3) + 1)).start();

    }
}
