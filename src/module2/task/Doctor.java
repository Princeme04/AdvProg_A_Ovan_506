package module2.task;

public class Doctor {
    private static final double BONUS_RATE = 0.08;
    private String name;//encap field
    private int id;
    private double salary;
    private String specialization;

    // Constructor
    public Doctor(String name, int id, double salary, String specialization) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.specialization = specialization;
    }

    // Method
    public void applyBonus() {
        salary += calculateBonus();
        System.out.println("Bonus applied ! New Salary : " + salary);
    }

    private double calculateBonus() {
        double bonus = salary * BONUS_RATE;
        return bonus;
    }

    public void printDetails() {
        System.out.println("Doctor ID: " + id);
        System.out.println("Doctor Name: " + getName());
        System.out.println("Doctor Specialization: " + specialization);
        System.out.println("Salary: $" + salary);
    }

    // Update specialization
    public void updateSpecialization(String newSpecialization) {
        specialization = newSpecialization;
        System.out.println("Specialization updated to : " + specialization);
    }

    public String getName() {
        return name;
    }
}
