package CORE_JAVA.OPPS;

// Class definition
class Car {
    // Fields (attributes)
    String color;
    int speed;

    // Method (behavior)
    void drive() {
        System.out.println("Car is driving at " + this.speed + " km/h");
    }
}
public class Main {
    public static void main(String[] args) {
        // Creating an object of class Car
        Car myCar = new Car();
        Car myCar2=new Car();

        // Assigning values to the object's fields
        myCar.color = "Red";
        myCar.speed = 80;
        myCar2.color="blue";
        myCar2.speed= 49;

        // Calling a method on the object
        myCar.drive();
        myCar2.drive();
    }
}
