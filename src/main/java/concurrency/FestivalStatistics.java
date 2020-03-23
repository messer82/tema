package concurrency;

public class FestivalStatistics {

    private String ticket;
    private int gate;

    TicketType ticketType = new TicketType();
    FestivalGate festivalGate = new FestivalGate();
    FestivalAttendee festivalAttendee = new FestivalAttendee();

    @Override
    public String toString() {
        return "FestivalStatistics{" +
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

    public void makeStatistics() {
        ticket = festivalAttendee.ticketType.getTicket();
        gate = festivalAttendee.festivalGate.getGateNumber();
    }
}
