package concurrency;

public class TicketTypeThread implements Runnable {

    private TicketType ticketType;

    public TicketTypeThread(TicketType ticketType) {
        this.ticketType = ticketType;
    }

    @Override
    public void run() {
        ticketType.randomTicket();
    }
}
