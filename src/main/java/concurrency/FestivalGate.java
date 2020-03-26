package concurrency;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class FestivalGate {

    private BlockingQueue<TicketType> queue;

    public synchronized void putNewTicketInTheQueue(TicketType ticketType) {
        while (queue.remainingCapacity() > 0) {
            try {
                queue.put(ticketType);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public BlockingQueue<TicketType> getQueue() {
        return queue;
    }

    public void setQueue(BlockingQueue<TicketType> queue) {
        this.queue = queue;
    }

    //    private int gateNumber;
//
//    public int getGateNumber() {
//            return gateNumber;
//    }
//
//    public void setGateNumber(int gateNumber) {
//            this.gateNumber = gateNumber;
//    }

//    @Override
//    public String toString() {
//        return "FestivalGate{" +
//                "gateNumber=" + gateNumber +
//                '}';
//    }



//    public int assignGateNumber() {
//        gateNumber = new Random().nextInt(3) + 1;
//        return gateNumber;
//    }
}
