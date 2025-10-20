package module2.task.task2;

public class TaxiTicket extends ticket implements operational {
    public static final double TAX_RATE = 0.1;
    public double duration;
    private double speed;

    private static final double MIN_SPEED = 5;
    private static final double MAX_SPEED = 100;

    public TaxiTicket(TaxiTicketInfo taxiTicketInfo, double duration, double speed) {
        super(taxiTicketInfo.passengerName(), taxiTicketInfo.startLocation(), taxiTicketInfo.destination(), taxiTicketInfo.price());
        this.duration = duration;
        this.speed = speed;
    }

    // Method to check taxi status
    @Override
    public void checkStatus() {
        System.out.println("Your taxi is heading to " + destination);
    }

    // Method to display estimated travel duration
    @Override
    public void displayEstimatedDuration() {
        System.out.println("Estimated travel duration: " + duration + " minutes");
    }

    // Method to display the route
    @Override
    public void displayRoute() {
        System.out.println("Route: " + startLocation + " -> " + destination);
    }

    // Method to slow down the taxi
    public void slowDown(double speedReduction) {
        speed -= speedReduction;
        if (speed < MIN_SPEED)
            speed = MIN_SPEED;
        duration += speedReduction * 0.5;
        System.out.println("Taxi slowed down! Current speed: " + speed + " km/h");
    }

    // Method to speed up the taxi
    public void speedUp(double speedIncrease) {
        speed += speedIncrease;
        if (speed > MAX_SPEED)
            speed = MAX_SPEED;
        System.out.println("Taxi sped up! Current speed: " + speed + " km/h");
    }

    // Method to display basic info
    @Override
    public void displayInfo() {
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Start Location: " + startLocation);
        System.out.println("Destination: " + destination);
        System.out.println("Price: " + price);
        System.out.println("Final Price: " + (price + calculateFinalPrice()));
    }

    private double calculateFinalPrice() {
        return price * TAX_RATE;
    }

    // Method to display full info
    public void detailedInfo() {
        displayInfo();
        System.out.println("Duration: " + duration + " minutes");
        System.out.println("Speed: " + speed + " km/h");
    }

}

