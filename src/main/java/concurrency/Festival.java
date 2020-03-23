package concurrency;

import java.util.concurrent.ArrayBlockingQueue;

public class Festival {

    public static void main(String[] args) {

        ArrayBlockingQueue queue = new ArrayBlockingQueue<>(1024);

        TicketType ticketType = new TicketType();

        TicketTypeThread ticketTypeThread = new TicketTypeThread(ticketType);

        ticketTypeThread.run();

        FestivalGate festivalGate = new FestivalGate();

        FestivalGateThread festivalGateThread = new FestivalGateThread(festivalGate);

        festivalGateThread.run();

//        FestivalAttendee festivalAttendee = new FestivalAttendee();
//        FestivalAttendee festivalAttendee = new FestivalAttendee(ticketType.getTicket(), festivalGate.getGateNumber());

        FestivalAtendeeThread festivalAtendeeThread = new FestivalAtendeeThread(queue);

//        while (queue.remainingCapacity() > 0) {

            festivalAtendeeThread.run();
//        }

        new Thread(festivalAtendeeThread).start();

//        FestivalStatistics festivalStatistics = new FestivalStatistics();
        FestivalStatisticsThread festivalStatisticsThread = new FestivalStatisticsThread(queue);
        festivalStatisticsThread.run();
        new Thread(festivalStatisticsThread).start();

    }
}
