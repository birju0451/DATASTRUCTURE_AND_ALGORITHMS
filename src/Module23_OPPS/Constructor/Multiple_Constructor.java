package Module23_OPPS.Constructor;

class Car {
    String brand;
    int speed;

    // 1. Default constructor
    Car() {
        brand = "Unknown";
        speed = 0;
    }

    // 2. Constructor with brand
    Car(String brand) {
        this.brand = brand;
        this.speed = 0;
    }

    // 3. Constructor with speed
    Car(int speed) {
        this.speed = speed;
        this.brand = "Unknown";
    }

    // 4. Constructor with brand and speed
    Car(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // 5. Copy constructor
    Car(Car c) {
        this.brand = c.brand;
        this.speed = c.speed;
    }
}

public class Multiple_Constructor {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car("BMW");
        Car car3 = new Car(200);
        Car car4 = new Car("Audi", 180);
        Car car5 = new Car(car4);

        System.out.println(car1.brand + " " + car1.speed);
        System.out.println(car2.brand + " " + car2.speed);
        System.out.println(car3.brand + " " + car3.speed);
        System.out.println(car4.brand + " " + car4.speed);
        System.out.println(car5.brand + " " + car5.speed);
    }
}
