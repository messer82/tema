package concurrency;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Every Festival has a gate, where people have to show their tickets.
//
//Write an application where every person is represented by a special Thread that is instantiated with random ticket data. Possible ticket types: full, full-vip, free-pass, one-day, one-day-vip
//
//FestivalGate gate = new FestivalGate();
//
//TicketType ticketType = // this should be enum value randomly generated.
//
//FestivalAttendeeThread festivalAttendee = new FestivalAttendeeThread(ticketType, gate);
//
//Every attendee validates the ticket, and the ticket-data is kept in a queue.

public class Festival {

    public static void main(String[] args) {

        BlockingQueue<TicketType> queue = new ArrayBlockingQueue<>(1024);
        FestivalGate festivalGate = new FestivalGate(queue);

            new Thread(new FestivalAttendeeThread(festivalGate)).start();


        new Thread(new FestivalStatisticsThread(festivalGate)).start();

    }
}
