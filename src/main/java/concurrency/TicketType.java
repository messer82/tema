package concurrency;

import java.util.Random;

public class TicketType {
    private String ticket;

    public TicketType(){
        this.ticket = randomTicket();
    }

    @Override
    public String toString() {
        return "TicketType{" +
                "ticket='" + ticket +
                '}';
    }

    public String getTicket() {
            return ticket;
    }

    public void setTicket(String ticket) {
            this.ticket = ticket;
    }

    public String randomTicket() {
        int randomTicket = new Random().nextInt(5);
            try {
                if (randomTicket == 0) {
                    ticket = "one-day";
                } else if (randomTicket == 1) {
                    ticket = "one-day-vip";
                } else if (randomTicket == 2) {
                    ticket = "free-pass";
                } else if (randomTicket == 3) {
                    ticket = "full";
                } else {
                    ticket = "full-vip";
                }

            } catch (Exception e) {
                System.out.println(e);
            }
        return ticket;
    }
}
