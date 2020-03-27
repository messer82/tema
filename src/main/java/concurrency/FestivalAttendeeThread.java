package concurrency;

public class FestivalAttendeeThread implements Runnable {

    TicketType ticketType = new TicketType();  // random ticket type
    FestivalGate festivalGate;

    public void run() {
        festivalGate.putNewTicketInTheQueue();
    }


    public FestivalAttendeeThread(FestivalGate gate) {
        this.festivalGate = gate;
    }

}
