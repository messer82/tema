package concurrency;

import java.util.Random;

public class TicketType {
    private String ticket;

    Random random = new Random();

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    @Override
    public String toString() {
        return "TicketType{" +
                "ticket='" + ticket + '\'' +
                ", random=" + random +
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

    int i = 0;

    public String randomTicket() {
            int randomTicket = random.nextInt(5);
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
