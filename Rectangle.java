import java.util.Scanner;

class Rectangle {
    private double length;
    private double breadth;

    // Constructor to initialize length and breadth
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate area
    public double calculateArea() {
        return length * breadth;
    }

    // Method to calculate perimeter
    public double calculatePerimeter() {
        return 2 * (length + breadth);
    }

    // Method to display results
    public void display() {
        System.out.println("Length: " + length + " | Breadth: " + breadth);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length: ");
        double l = sc.nextDouble();
        System.out.print("Enter Breadth: ");
        double b = sc.nextDouble();

        Rectangle rect = new Rectangle(l, b);

        System.out.println("\nRectangle Results");
        rect.display();

        sc.close();
    }
}