import java.util.Scanner;

class Student {
    String name;
    String usn;

    public void acceptDetails() {
        Scanner scanner = new Scanner(System.util.in);
        
        System.out.print("Enter Student Name: ");
        this.name = scanner.nextLine();         
        System.out.print("Enter Student USN: ");
        this.usn = scanner.nextLine();  
    }

    public void displayDetails() {
        System.out.println("\nStudent Details");
        System.out.println("Name: " + this.name);
        System.out.println("USN : " + this.usn);
    }
}

public class Main {
    public static void main(String[] args) {
        Student studentObject = new Student();
        
        studentObject.acceptDetails();
        studentObject.displayDetails();
    }
}
 
