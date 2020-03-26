package concurrency;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.BlockingQueue;

public class FestivalStatisticsThread implements Runnable {

    private FestivalGate festivalGate;
    public FestivalStatisticsThread(FestivalGate festivalGate){
        this.festivalGate = festivalGate;
    }
    protected BlockingQueue<FestivalAttendeeThread> queue;

    private List<String> list;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    private int gate;

    public int getGate() {
        return gate;
    }

    public void setGate(int gate) {
        this.gate = gate;
    }

    List<String> list1 = new LinkedList<>();
    List<String> list2 = new LinkedList<>();
    List<String> list3 = new LinkedList<>();
    List<String> list4 = new LinkedList<>();

    @Override
    public void run() {
        try {
            while (true) {
                FestivalAttendeeThread festivalAttendee = queue.take();
                if (festivalAttendee.getGate() == 1) {
                    this.list = list1;
                    list1.add(festivalAttendee.getTicket());
                } else if (festivalAttendee.getGate() == 2) {
                    this.list = list2;
                    list2.add(festivalAttendee.getTicket());
                } else if (festivalAttendee.getGate() == 3) {
                    this.list = list3;
                    list3.add(festivalAttendee.getTicket());
                } else {
                    this.list = list4;
                    list4.add(festivalAttendee.getTicket());
                }
                makeStatistics(gate);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }



    private void makeStatistics(int gate) throws InterruptedException {
            System.out.println("At gate " + gate + " " + list.size() + " people entered.");
            list.sort(String::compareTo);
            int oneDayCount = (int) festivalGate.getQueue().stream().filter(s -> s.equals("one-day")).count();
            int oneDayVipCount = (int) list.stream().filter(s -> s.equals("one-day-vip")).count();
            int freePassCount = (int) list.stream().filter(s -> s.equals("free-pass")).count();
            int fullCount = (int) list.stream().filter(s -> s.equals("full")).count();
            int fullVipCount = (int) list.stream().filter(s -> s.equals("full-vip")).count();

            System.out.println(oneDayCount + " people have one-day tickets.");
            System.out.println(oneDayVipCount + " people have one-day-vip tickets.");
            System.out.println(freePassCount + " people have free-pass.");
            System.out.println(fullCount + " people have full pass.");
            System.out.println(fullVipCount + " people have full-vip pass.");

        Thread.sleep(50);
    }

    public FestivalStatisticsThread(BlockingQueue<FestivalAttendeeThread> queue, int gate) {
        this.queue = queue;
        this.gate = gate;
    }
}
