import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Employee
        System.out.println("Enter Employee Details:");
        System.out.print("Employee ID: ");
        int empID = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Employee Salary: ");
        double salary = scanner.nextDouble();

        Employee1 employee1 = new Employee1(empID, name, salary);
        double incomeTax = employee1.calcTax();
        System.out.println("\n" + employee1);
        System.out.println("Income Tax: INR" + incomeTax);

        // Input for Product
        System.out.println("\nEnter Product Details:");
        System.out.print("Product ID: ");
        int pid = scanner.nextInt();

        System.out.print("Product Price: ");
        double price = scanner.nextDouble();

        System.out.print("Product Quantity: ");
        int quantity = scanner.nextInt();

        Product1 product1 = new Product1(pid, price, quantity);
        double salesTax = product1.calcTax();
        System.out.println("\n" + product1);
        System.out.println("Sales Tax: INR" + salesTax);

        scanner.close();
    }
}

