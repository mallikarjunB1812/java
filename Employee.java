import java.util.Scanner;

class Employee {
    private int employeeID;
    private String name;
    private double salary;

    public void acceptDetails(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        this.employeeID = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Employee Name: ");
        this.name = sc.nextLine();
        System.out.print("Enter Salary: ");
        this.salary = sc.nextDouble();
    }

    public void displayDetails() {
        System.out.println("ID: " + employeeID + " | Name: " + name + " | Salary: " + salary);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of employees: ");
        int count = sc.nextInt();

        Employee[] employees = new Employee[count];

        for (int i = 0; i < count; i++) {
            System.out.println("\n--- Entering details for Employee " + (i + 1) + " ---");
            employees[i] = new Employee();
            employees[i].acceptDetails(sc);
        }

        System.out.println("\n--- Employee Details ---");
        for (Employee emp : employees) {
            emp.displayDetails();
        }

        sc.close();
    }
}