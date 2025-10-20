package module2.task.task2;

public abstract class ticket {
    public String passengerName;
    public String startLocation;
    public String destination;
    public double price;

    public ticket(String passengerName, String startLocation, String destination, double price) {
        this.passengerName = passengerName;
        this.startLocation = startLocation;
        this.destination = destination;
        this.price = price;
    }

    // Method to display basic info
    public abstract void displayInfo();
}
