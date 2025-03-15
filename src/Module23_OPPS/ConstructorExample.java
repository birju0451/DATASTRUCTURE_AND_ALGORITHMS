package Module23_OPPS;

class Students { // Changed to PascalCase
    String name;
    short rollnumber;
    double percentage;

    // Default constructor
    public Students() {
    }

    // Parameterized constructor
    public Students(String name, short roll, double per) {
        this.name = name;
        this.rollnumber = roll;
        this.percentage = per;
    }

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollnumber);
        System.out.println("Percentage: " + percentage);
    }
}

public class ConstructorExample { // Renamed class to avoid conflict with Java keyword
    public static void main(String[] args) {
        // Creating an object using the default constructor
        Students s1 = new Students();
        s1.name = "Raghav";
        s1.rollnumber = 76;
        s1.percentage = 88.6;

        // Creating an object using the parameterized constructor
        Students s2 = new Students("Amit", (short) 45, 91.2);

        // Displaying student details
        s1.display();
        s2.display();
    }
}
