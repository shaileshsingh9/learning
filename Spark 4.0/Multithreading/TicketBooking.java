

class TicketCounter {

    private int availableTickets = 5;

    synchronized void bookTicket(int tickets) {

        if (availableTickets >= tickets) {

            System.out.println(Thread.currentThread().getName() + " booking " + tickets + " tickets");

            availableTickets = availableTickets - tickets;

            System.out.println("Tickets remaining: " + availableTickets);

        } else {

            System.out.println(Thread.currentThread().getName() + " - Not enough tickets");
        }
    }

    int getAvailableTickets() {
        return availableTickets;
    }
}

public class TicketBooking {

    public static void main(String[] args) throws InterruptedException {

        TicketCounter counter = new TicketCounter();

        Thread t1 = new Thread(
                () -> counter.bookTicket(3),
                "Thread-1"
        );

        Thread t2 = new Thread(
                () -> counter.bookTicket(3),
                "Thread-2"
        );

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Available Tickets: " + counter.getAvailableTickets());
    }
}