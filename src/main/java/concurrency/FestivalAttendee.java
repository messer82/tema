package concurrency;

public class FestivalAttendee {

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
        synchronized (this) {
            return ticket;
        }
    }

    public void setTicket(String ticket) {
        synchronized (this) {
            this.ticket = ticket;
        }
    }

    public int getGate() {
        synchronized (this) {
            return gate;
        }
    }

    public void setGate(int gate) {
        synchronized (this) {
            this.gate = gate;
        }
    }

    public void atendeeDetails() {
        ticket = ticketType.randomTicket();
        gate = festivalGate.assignGateNumber();
    }
}
