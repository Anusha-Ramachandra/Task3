public class Employee1 implements Taxable {
    private int empID;
    private String name;
    private double salary;

    // Constructor
    public Employee1(int empID, String name, double salary) {
        this.empID = empID;
        this.name = name;
        this.salary = salary;
    }

    // Calculate income tax based on salary
    @Override
    public double calcTax() {
        return salary * INCOME_TAX;
    }

    @Override
    public String toString() {
        return "Employee ID: " + empID + ", Name: " + name + ", Salary: " + salary;
    }
}

