package concurrency;

import java.util.concurrent.BlockingQueue;

public class FestivalAttendeeThread implements Runnable {

    protected BlockingQueue<FestivalAttendeeThread> queue;

    private String ticket;
    private int gate;

    TicketType ticketType = new TicketType();
    FestivalGate festivalGate = new FestivalGate();

    @Override
    public String toString() {
        return "FestivalAttendee{" +
                "ticket='" + ticket + '\'' +
                ", gate=" + gate +
                '}';
    }

    public String getTicket() {
            return ticket;
    }

    public void setTicket(String ticket) {
            this.ticket = ticket;
    }

    public int getGate() {
            return gate;
    }

    public void setGate(int gate) {
            this.gate = gate;
    }

    public FestivalAttendeeThread(String ticket, int gate) {
        this.ticket = ticket;
        this.gate = gate;
    }

    public void run() {
        while (queue.remainingCapacity() > 0) {
            try {
                queue.put(new FestivalAttendeeThread(ticketType.randomTicket(), festivalGate.assignGateNumber()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public FestivalAttendeeThread(BlockingQueue<FestivalAttendeeThread> queue) {
        this.queue = queue;
    }
}
