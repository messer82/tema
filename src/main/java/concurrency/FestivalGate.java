package concurrency;

import java.util.concurrent.BlockingQueue;

public class FestivalGate {

    private BlockingQueue<TicketType> queue;

    public BlockingQueue<TicketType> getQueue() {
        return queue;
    }

    public void setQueue(BlockingQueue<TicketType> queue) {
        this.queue = queue;
    }

    public FestivalGate(BlockingQueue<TicketType> queue) {
        this.queue = queue;
    }

    public synchronized void putNewTicketInTheQueue() {
        while (true) {
            try {
                queue.put(new TicketType());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
