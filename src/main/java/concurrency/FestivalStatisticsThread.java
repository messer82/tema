package concurrency;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BlockingQueue;

public class FestivalStatisticsThread implements Runnable {

    private FestivalGate festivalGate;
    public FestivalStatisticsThread(FestivalGate festivalGate){
        this.festivalGate = festivalGate;
    }
    protected BlockingQueue<TicketType> queue;

    @Override
    public void run() {
        try {
            while (true) {
                makeStatistics();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private void makeStatistics() throws InterruptedException {
        Thread.sleep(2000);
            System.out.println(festivalGate.getQueue().size() + " people entered.");
            int oneDayCount = (int) festivalGate.getQueue().stream().filter(t -> t.getTicket().equals("one-day")).count();
//            int oneDayCount = (int) queue.stream().filter(s -> s.equals("one-day")).count();
            int oneDayVipCount = (int) festivalGate.getQueue().stream().filter(t -> t.getTicket().equals("one-day-vip")).count();
            int freePassCount = (int) festivalGate.getQueue().stream().filter(t -> t.getTicket().equals("free-pass")).count();
            int fullCount = (int) festivalGate.getQueue().stream().filter(t -> t.getTicket().equals("full")).count();
            int fullVipCount = (int) festivalGate.getQueue().stream().filter(t -> t.getTicket().equals("full-vip")).count();

            System.out.println(oneDayCount + " people have one-day tickets.");
            System.out.println(oneDayVipCount + " people have one-day-vip tickets.");
            System.out.println(freePassCount + " people have free-pass.");
            System.out.println(fullCount + " people have full pass.");
            System.out.println(fullVipCount + " people have full-vip pass.");
    }

    public FestivalStatisticsThread(BlockingQueue<TicketType> queue) {
        this.queue = queue;
    }
}
