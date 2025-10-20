package module2.task.task2;

public class MainApp {
    public static void main(String[] args) {
        TaxiTicket ticket = new TaxiTicket(new TaxiTicketInfo("Alice", "Downtown", "Airport", 50.0), 30.0, 60.0);

        ticket.detailedInfo();
        ticket.checkStatus();
        ticket.displayRoute();
        ticket.displayEstimatedDuration();
        ticket.slowDown(20);
        ticket.speedUp(15);
    }
}
