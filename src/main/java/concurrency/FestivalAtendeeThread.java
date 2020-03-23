package concurrency;

import java.util.concurrent.ArrayBlockingQueue;

public class FestivalAtendeeThread implements Runnable {

    TicketType ticketType = new TicketType();
    FestivalGate festivalGate = new FestivalGate();
    FestivalGateThread festivalGateThread = new FestivalGateThread(festivalGate);

    protected ArrayBlockingQueue queue = null;

    FestivalAttendee festivalAttendee = new FestivalAttendee();

    public FestivalAtendeeThread(ArrayBlockingQueue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (queue.remainingCapacity() > 0) {
            festivalAttendee.atendeeDetails();
            try {
                queue.put(festivalAttendee);
//                System.out.println(festivalAttendee);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
