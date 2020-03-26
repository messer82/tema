package concurrency;

import java.util.concurrent.BlockingQueue;

public class FestivalAttendeeThread implements Runnable {

    TicketType ticketType = new TicketType();  // random ticket type
    FestivalGate festivalGate;

    public void run() {
        festivalGate.putNewTicketInTheQueue(ticketType);
    }


    public FestivalAttendeeThread(FestivalGate gate) {
        this.festivalGate = gate;
    }





//    @Override
//    public String toString() {
//        return "FestivalAttendee{" +
//                "ticket='" + ticket + '\'' +
//                ", gate=" + gate +
//                '}';
//    }
//
//    public String getTicket() {
//            return ticket;
//    }
//
//    public void setTicket(String ticket) {
//            this.ticket = ticket;
//    }
//
//    public int getGate() {
//            return gate;
//    }
//
//    public void setGate(int gate) {
//            this.gate = gate;
//    }
//
//    public FestivalAttendeeThread(String ticket, int gate) {
//        this.ticket = ticket;
//        this.gate = gate;
//    }

}
